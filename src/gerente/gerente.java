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
    public double Nsalario;
    
    public gerente(String nome, String CPF, double salario, double CRM){
        super(nome,CPF,salario);
        this.CRM = CRM;
    }

    public double getBonificacaoGer() {
        return bonificacaoGer;
    }

    public double Nslario(){
       Nsalario = (bonificacaoGer * salario) + salario;
        return Nsalario;
    }
    
    /**
     *0,20
     */
    @Override
    public void imprimir(){
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + CPF);
        System.out.println("Salario: R$" + salario);
        System.out.println("CRM: " + CRM);
        System.out.println("Bonificação :" + getBonificacaoGer());
        System.out.println("Salario Atualizado: R$" + Nslario());
    }
}
