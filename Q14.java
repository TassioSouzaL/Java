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
public class Q14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        
         
         System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quilowattsConsumidos = entrada.nextDouble();


        double valorQuilowatt = salarioMinimo / 5;
        double valorAPagar = quilowattsConsumidos * valorQuilowatt;
        double valorComDesconto = valorAPagar * 0.85;

        
        System.out.println("Valor de cada quilowatt: R$ " + valorQuilowatt);
        System.out.println("Valor a ser pago: R$ " + valorAPagar);
        System.out.println("Valor a ser pago com desconto de 15%: R$ " + valorComDesconto);
    }
    
}
