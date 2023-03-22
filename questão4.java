//Questão 04. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
// prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o
// valor das prestações.
package projetojava;

import java.util.Scanner;

public class questão4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o valor do produto: ");
		double valordoproduto = entrada.nextDouble();
		double valordasprestaçoes = valordoproduto / 5;
		
		System.out.print("essa são as prestações: " +valordasprestaçoes);

	}
}
