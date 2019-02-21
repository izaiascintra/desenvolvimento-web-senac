
package com.github.braully.dws.Controle;

import com.github.braully.dws.modelo.Cliente;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

@Component
public class ClienteControle {

    Cliente cliente;

    public ClienteControle() {
        novoCliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void novoCliente() {
        this.cliente = new Cliente();
    }

    public void salvarCliente() {
        String mensagem = "Cliente Salvo: " + cliente;
        System.out.println(mensagem);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
    }
}