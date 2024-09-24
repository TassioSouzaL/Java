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
public class Q15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        // Cálculo
        double fahrenheit = (9 * celsius / 5) + 32;

        // Exibição do resultado
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
    
}
