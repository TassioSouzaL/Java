/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atvidade;

import java.util.Scanner;

/**
 *
 * @author Tassio
 */
public class Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe seu salário: ");
        double sl = entrada.nextDouble();
        
        System.out.println("Informe o valor total de suas vendas: ");
        double ValVend = entrada.nextDouble();
        
        double comissao = ((ValVend*4)/100);
        double st = sl + ((ValVend*4)/100);
        
        System.out.printf("Salário com a comissão: %.2f \n", st);
        System.out.printf("Total da comissão: %.2f \n", comissao);
        
    }
    
}
