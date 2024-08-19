package one.digitalinnovation.avengers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = [Server(url = "/", description = "Default Server URL")])
@SpringBootApplication
class AvengersApiApplication

fun main(args: Array<String>) {
	runApplication<AvengersApiApplication>(*args)
}
