/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudante;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String periodoEscolar;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private char genero;
    private String email;
    private String telefone;
    private int anoDeIngresso;
    private int semestreDeIngresso;
    private String situaçãoAcademica;

    public void setPeriodo(String periodoEcolar) {
        this.periodoEscolar = periodoEscolar;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAnoIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public void setSemestreIngresso(int semestreDeIngresso) {
        this.semestreDeIngresso = semestreDeIngresso;
    }

    public void setSituação(String situaçãoAcademica) {
        this.situaçãoAcademica = situaçãoAcademica;
    }

}
