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
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double n3 = entrada.nextDouble();
        
        double media = (n1+n2+n3)/3;
        
        System.out.printf("A média é: %.2f \n" , media);
    }
    
}
