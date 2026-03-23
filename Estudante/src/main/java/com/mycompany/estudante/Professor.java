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
public class Professor {

    private String nome;
    private int numeroId;
    private int email;
    private String telefone;
    private String titulaçãoAcademica;
    private String área;
    private String regime;
    private Date dataIngresso;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }
    
    public void setEmail(int email) {
        this.email = email;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setTitulação(String titulaçãoAcademica) {
        this.titulaçãoAcademica = titulaçãoAcademica;
    }
    
    public void setÁrea(String área) {
        this.área = área;
    }
    
    public void setRegime(String regime) {
        this.regime = regime;
    }
    
    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
}
