/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerente;

import funcionario.funcionario;

/**
 *
 * @author rafael
 */
public class gerente extends funcionario{
    protected double CRM;
    
    public gerente(String nome, String CPF, double salario, double CRM){
        super(nome,CPF,salario);
        this.CRM = CRM;
    }

    /**
     *
     * @return
     */
    @Override
    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    /**
     *
     */
    @Override
    public void imprimir(){
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + CPF);
        System.out.println("Salario: R$" + salario);
        System.out.println("CRM: " + CRM);
        System.out.println("Bonificação: " + bonificacao);
    }
}
