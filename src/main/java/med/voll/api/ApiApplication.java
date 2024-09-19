package med.voll.api;

import med.voll.api.GUI.Login;

import javax.swing.JFrame;
import java.io.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        // Crear el directorio 'data' si no existe
        ensureDataDirectoryExists();

        // Desactiva el modo headless
        System.setProperty("java.awt.headless", "false");

        // Inicia la aplicación Spring Boot
        SpringApplication.run(ApiApplication.class, args);

        // Abre la ventana de login en un nuevo hilo
        java.awt.EventQueue.invokeLater(() -> {
            Login login = new Login(); // Usa el constructor sin argumentos
            login.setLocationRelativeTo(null); // Esto lo centra en la pantalla
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Asegúrate de cerrar la aplicación al cerrar la ventana
            login.setVisible(true); // Muestra la ventana
        });
    }

    // Método para asegurar que el directorio 'data' existe
    private static void ensureDataDirectoryExists() {
        File dataDir = new File("./data");
        if (!dataDir.exists()) {
            boolean created = dataDir.mkdirs(); // Crea los directorios necesarios
            if (created) {
                System.out.println("Directorio 'data' creado con éxito.");
            } else {
                System.err.println("No se pudo crear el directorio 'data'.");
            }
        }
    }
}


