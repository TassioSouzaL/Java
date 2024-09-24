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
public class Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor inteiro do produto: ");
        int vp = entrada.nextInt();
        
            double nv = vp-((vp*10)/100);
        
        System.out.printf("O novo valor do seu produto é: %.2f \n", nv);
    }
    
}
