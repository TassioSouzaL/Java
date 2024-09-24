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
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe seu salário: ");
        double sb = entrada.nextDouble();
        
        double sg = sb+((sb*5)/100);
        
        double desconto = (sg*7)/100;
        
        double st = sg - ((sg*7)/100);
        
        System.out.printf("Salário com gratificação: %.2f \n", sg);
        
        System.out.printf("Desconto: %.2f \n", desconto);
        
        System.out.printf("O salário final é: %.2f \n", st);
        
    }
    
}
