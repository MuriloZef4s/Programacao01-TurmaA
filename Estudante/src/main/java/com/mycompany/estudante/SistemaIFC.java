/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudante;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class SistemaIFC {
    public static void main(String[] args) {
        Estudante murilo = new Estudante();
        murilo.getNome();
        murilo.obterIdade(new Date());
        murilo.genero = 'm';
    }
}
