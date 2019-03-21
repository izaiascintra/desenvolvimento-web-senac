/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.braully.dws.Controle;

import java.util.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public class AplicacaoControle {

    String nomeAplicacao = "Senac ADS 2019";
    Map configuracoes = new HashMap();

    public AplicacaoControle() {
    }

    public Map getConfiguracoes() {
        return configuracoes;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }
}
