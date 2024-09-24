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
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Informe outro numero: ");
        int n2 = entrada.nextInt();
        
        if(n1>0){
        double div = n1/n2;
        
            System.out.println("O resultado é "+ div);
        }
    }
    
}
