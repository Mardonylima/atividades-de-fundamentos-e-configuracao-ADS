//Questão 02. Faça um Programa que peça a temperatura em graus Farenheit, transforme e
// mostre a temperatura em graus Celsius.
//  C = (5 * (F-32) / 9).
package projetojava;

import java.util.Scanner;

public class questão2 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("digite uma temperatura em farenheit (F°) :");
		double tf = entrada.nextDouble();
		double rc = 5 * ( tf - 32) / 9;
		System.out.print( rc + " C° \n" );
	}
}
