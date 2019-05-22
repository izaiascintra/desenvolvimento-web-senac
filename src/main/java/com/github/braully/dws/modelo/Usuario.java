package com.github.braully.dws.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Aluno
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String nome;

    @Basic
    private String senha;

    @Basic
    private Boolean removido;

    @ManyToMany
    private List<Papeis> Papeis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean isRemovido() {
        return removido;
    }

    public void setRemovido(Boolean removido) {
        this.removido = removido;
    }

    public List<Papeis> getPapeis() {
        if (Papeis == null) {
            Papeis = new ArrayList<>();
        }
        return Papeis;
    }

    public void setPapeis(List<Papeis> Papeis) {
        this.Papeis = Papeis;
    }

    public void addPapei(Papeis Papei) {
        getPapeis().add(Papei);
    }

    public void removePapei(Papeis Papei) {
        getPapeis().remove(Papei);
    }

}
