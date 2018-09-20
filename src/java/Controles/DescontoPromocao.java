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
public class DescontoPromocao implements Desconto{
    
    @Override
    public double calcula(Mensalidade mensalidade) {
        return mensalidade.getValor() * 0.1;
    }
    
}
