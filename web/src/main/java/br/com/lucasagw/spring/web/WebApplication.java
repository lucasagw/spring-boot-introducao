package br.com.lucasagw.spring.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.lucasagw.spring.web.autenticacao.Usuario;
import br.com.lucasagw.spring.web.autenticacao.UsuarioRepository;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);

	}

	@Bean
	public CommandLineRunner load(UsuarioRepository repository) {
		return (args) -> {
			Usuario usuario = new Usuario();
			usuario.setLogin("lucas@email.com");
			usuario.setSenha("1234");
			repository.save(usuario);
		};
	}
}