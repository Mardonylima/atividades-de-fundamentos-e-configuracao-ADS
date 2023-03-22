// Questão 03. Faça um Programa que peça a temperatura em graus Celsius, transforme e
// mostre em graus Farenheit.
// F° = [C°(temperatura dada) * 1.8] + 32
package projetojava;

import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("digite uma temperatura em celsios (C°) :");
		double tc = entrada.nextDouble();
		double rt = ( tc * 1.8 ) + 32;
		System.out.print( rt + " F° \n " );		
	}
}
