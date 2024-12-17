package dev.ovidio.service;

import dev.ovidio.entity.Usuario;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.commons.codec.digest.DigestUtils;

@ApplicationScoped
public class UsuarioService {

    public Usuario logar(String nome, String senha) {
        String senhaCripto = criptografaSenha(senha);
        Usuario usuario = Usuario.find("nome", nome)
                .<Usuario>firstResultOptional()
                .orElseGet(() -> {
                    var user = new Usuario();
                    user.nome = nome;
                    user.senha = senhaCripto;
                    Usuario.persist(user);
                    return user;
                });

        if (!usuario.senha.equals(senhaCripto)) {
            throw new IllegalArgumentException("Senha incorreta");
        }
        return usuario;
    }

    public String criptografaSenha(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("A senha não pode ser nula ou vazia.");
        }

        return DigestUtils.sha256Hex(senha);
    }

}
