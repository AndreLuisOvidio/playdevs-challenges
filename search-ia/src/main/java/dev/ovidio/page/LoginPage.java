package dev.ovidio.page;

import dev.ovidio.service.UsuarioService;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;

import java.net.URI;


@Path("/login")
public class LoginPage {

    @Inject
    UsuarioService usuarioService;

    @CheckedTemplate
    static class Templates {
        static native TemplateInstance login();
        static native TemplateInstance loginForm(String error);
    }


    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return Templates.login();
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Transactional
    public Object post(@FormParam("nome") String nome, @FormParam("senha") String senha) {
        try {
            var usuario = usuarioService.logar(nome, senha);
            NewCookie cookie = new NewCookie.Builder("usuarioId")
                    .value(usuario.id.toString())
                    .build();
            return Response
                    .seeOther(URI.create("/inicio"))
                    .cookie(cookie)
                    .build();
        }catch (IllegalArgumentException e) {
            return Templates.loginForm(e.getMessage());
        }
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("form-padrao")
    public TemplateInstance formPadrao() {
        return Templates.loginForm(null);
    }

}
