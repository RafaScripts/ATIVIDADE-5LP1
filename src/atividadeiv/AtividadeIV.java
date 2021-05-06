/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiv;

/**
 *
 * @author rafael
 */

import funcionario.funcionario;
import gerente.gerente;
import desenvolvedor.dev;

public class AtividadeIV {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Funcionarios / Gerentes / Desenvolvedores");
        System.out.println("============================");
        funcionario um = new funcionario("Rafael", "000.000.000-00", 1500);
        um.imprimir();
        System.out.println("============================");
        
        gerente dos = new gerente("juan", "000.000.000-00", 2000, 1.0);
        dos.imprimir();
        System.out.println("============================");
        
        dev tre = new dev("newt", "000.000.000-00", 5000);
        tre.imprimir();
    }
    
}
