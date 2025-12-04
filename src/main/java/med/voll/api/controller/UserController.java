/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import java.net.URI;
import med.voll.api.domain.usuarios.Usuario;
import med.voll.api.domain.usuarios.UsuarioRepository;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    @Transactional // Asegura que la transacción sea manejada correctamente
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario user, UriComponentsBuilder uriComponentsBuilder) {
        // Codificar la contraseña con BCrypt
        user.setClave(passwordEncoder.encode(user.getClave()));

// Guardar el usuario en la base de datos
        Usuario usuario = usuarioRepository.save(user);
        System.out.println("Usuario guardado con ID: " + usuario.getId());

        // Confirmar la transacción explícitamente (opcional)
        // Esto solo es necesario si hay algún error de configuración transaccional
        org.springframework.transaction.TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        if (status.isRollbackOnly()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        // Retornar la URI del usuario creado
        URI url = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(url).body(usuario);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
