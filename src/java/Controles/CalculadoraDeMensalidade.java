/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

/**
 *
 * @author caueo
 */
public class CalculadoraDeMensalidade {
    
    public void realizaCalculo(Mensalidade mensalidade, Desconto bolsa){
        double desconto = bolsa.calcula(mensalidade);
        System.out.println("Mensalidade com Desconto: ");
        System.out.println(mensalidade.getValor() - desconto);
    }
    
}
