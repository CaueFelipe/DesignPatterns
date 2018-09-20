/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.time.LocalDate;

/**
 *
 * @author caueo
 */
public class Aluno {
    
    private String nome;
    private LocalDate dataNascimento;
    private Contato contato;
    private Endereco endereco;

    public Aluno(String nome, LocalDate dataNascimento, Contato contato, Endereco endereco) {
        
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    
    
}
