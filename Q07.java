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
public class Q07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a primeira nota: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        int n2 = entrada.nextInt();
        
        System.out.println("Informe a terceira nota: ");
        int n3 = entrada.nextInt();
        
        
        int media = (n1*1)+(n2*2)+(n3*3);
        
        System.out.println("A sua média ponderada é: "+ media);
        
    }
    
}
