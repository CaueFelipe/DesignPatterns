/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles.builders;

import Controles.Aluno;
import Controles.Contato;
import Controles.Endereco;
import java.time.LocalDate;

/**
 *
 * @author caueo
 */
public class AlunoBuilder {
    
    private String nome;
    private LocalDate dataNascimento;
    private Contato contato;
    private Endereco endereco;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    
    public AlunoBuilder comCep(String cep){
        this.cep = cep;
        return this;
    }
    
    public AlunoBuilder comLogradouro(String logradouro){
        this.logradouro = logradouro;
        return this;
    } 
    
    public AlunoBuilder comNumero(String numero){
        this.numero = numero;
        return this;
    } 
    
    public AlunoBuilder comBairro(String bairro){
        this.bairro = bairro;
        return this;
    } 
    
    public AlunoBuilder comCidade(String cidade){
        this.cidade = cidade;
        return this;
    } 
    
    public AlunoBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public  AlunoBuilder comDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
        return this;
    }
    
    public AlunoBuilder comContato(Contato contato){
        this.contato = contato;
        return this;
    }
    
    public AlunoBuilder comEndereco(Endereco endereco){
        this.endereco = endereco;
        return this;
    }
    
    public Aluno constroiAluno(){
        this.endereco = new Endereco(cep, logradouro, numero, bairro, cidade);
        return new Aluno(nome, dataNascimento, contato, endereco);
    }

    
    
}
