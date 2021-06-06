package br.com.lucasagw.spring.web.autenticacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	public Usuario findByLoginAndSenha(String login, String senha);

}
