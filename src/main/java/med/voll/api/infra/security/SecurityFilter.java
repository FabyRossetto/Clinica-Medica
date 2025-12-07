package med.voll.api.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import med.voll.api.domain.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println(">>> INTENTO DE REQUEST: " + request.getMethod() + " " + request.getRequestURI()); // Veremos si llega el PUT
        
        var authHeader = request.getHeader("Authorization");
        
        if (authHeader != null) {
            var token = authHeader.replace("Bearer ", "");
            try {
                // Aquí es donde falla si la clave es distinta
                var nombreUsuario = tokenService.getSubject(token); 
                
                if (nombreUsuario != null) {
                    var usuario = usuarioRepository.findByLogin(nombreUsuario);
                    if (usuario != null) {
                        var authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                        System.out.println(">>> EXITO: Usuario autenticado: " + nombreUsuario);
                    } else {
                        System.err.println(">>> ERROR: Token válido, pero usuario no encontrado en BD.");
                    }
                }
            } catch (Exception e) {
                // ESTO ES LO QUE NECESITAMOS VER
                System.err.println(">>> ERROR CRÍTICO TOKEN: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                e.printStackTrace(); // Imprime la traza completa en la consola de Render
            }
        } else {
            System.out.println(">>> AVISO: No llegó header Authorization (Normal para Login/Swagger)");
        }
        
        filterChain.doFilter(request, response);
    }
}

