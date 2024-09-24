
package Atvidade;

import java.util.Scanner;


public class Q12 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner  (System.in);
        
        System.out.print("Digite o preço de fábrica do veículo: ");
        double precoFabrica = entrada.nextDouble();

        System.out.print("Digite o percentual de lucro do distribuidor: ");
        double percentualLucro = entrada.nextDouble();

        System.out.print("Digite o percentual de impostos: ");
        double percentualImpostos = entrada.nextDouble();

  
        double valorLucroDistribuidor = precoFabrica * (percentualLucro / 100);
        double valorImpostos = precoFabrica * (percentualImpostos / 100);
        double precoFinal = precoFabrica + valorLucroDistribuidor + valorImpostos;

        
        System.out.println("Valor do lucro do distribuidor: R$ " + valorLucroDistribuidor);
        System.out.println("Valor dos impostos: R$ " + valorImpostos);
        System.out.println("Preço final do produto: R$ " + precoFinal);
    }
    
}
