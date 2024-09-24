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
public class Q13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

       
        double valorHoraTrabalhada = salarioMinimo / 10;
        
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        
        double imposto = salarioBruto * 0.03;
        
        double salarioReceber = salarioBruto - imposto;

        
        System.out.println("Valor da hora trabalhada: R$ " + valorHoraTrabalhada);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Salário a receber: R$ " + salarioReceber);
    }
    
}
