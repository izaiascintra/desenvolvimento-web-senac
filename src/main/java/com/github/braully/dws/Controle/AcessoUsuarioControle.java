package com.github.braully.dws.Controle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Component
@Scope("session")
public class AcessoUsuarioControle {

    String nomeUsuario;
    String senha;
    Boolean logado = false;

    public String entrar() {
        if ("123456".equals(senha)) {
            logado = true;
            return "home.xhtml";
        } else {
            FacesMessage msgJsf = new FacesMessage("Senha incorreta!");
            msgJsf.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, msgJsf);
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/sair")
    public String sair(HttpSession session) {
        session.invalidate();
        return "redirect:/login.xhtml";

    }

    public Boolean getLogado() {
        return logado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}