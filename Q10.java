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
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a medida em pes: ");
        double pes = entrada.nextDouble();
        
        
        
       double polegadas = pes*12;
        double jardas = pes/3;
        double milhas = jardas/1760;
    
        System.out.printf("Polegadas: %.2f \n", polegadas);
        System.out.printf("Jardas: %.2f \n", jardas);
        System.out.printf("Milhas: %.2f \n", milhas);
    }
    
}
