package br.com.lucasagw.spring.web.autenticacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	private UsuarioRepository userRepository;

	@GetMapping("/")
	public String index(UsuarioDTO usuario) {
		// UsuarioDTO usuario = new UsuarioDTO();
		// usuario.setLogin("xpto");
		// request.setAttribute("usuarioDTO", usuario);
		usuario.setLogin("xpto");
		return "index";
	}

	@PostMapping("/login")
	public String login(UsuarioDTO usuario) {
		System.out.println(usuario);
		Usuario entity = userRepository.findByLoginAndSenha(usuario.getLogin(), usuario.getSenha());
		System.out.println(entity);
		return "welcome";
		// String login = request.getParameter("usuario");
		// String password = request.getParameter("password");

	}

}
