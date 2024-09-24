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
public class Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe ano de nascimento: ");
        int an = entrada.nextInt();
        
        System.out.println("Informe ano atual: ");
        int aa = entrada.nextInt();
        
         int idadeAnos = aa - an;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeAnos * 52;
        
        System.out.println("Idade em Anos: " + idadeAnos);
        System.out.println("Idade em meses: "+ idadeMeses);
        System.out.println("Idade em dias: "+ idadeDias);
        System.out.println("Idade em semanas: "+ idadeSemanas);
    }
    
}
