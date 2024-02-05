package cl.noticias.backend.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
            contact = @Contact(
                name = "Gian Parra",
                email = "gian.parra96@gmail.com",
                url = "https://github.com/PaarXul/"
            ),
            description = "API Agregar favoritos ",
            title = "Favoritos API",
            version = "1.0.0"
),
        servers = {
                @Server(
                        description = "Servidor local",
                        url = "http://localhost:8081"
                )
        }
)
public class OpenApiConfig {

}