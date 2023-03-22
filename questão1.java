// Questão 01. Faça um algoritmo que receba dois números e ao final mostre a soma,
// subtração, multiplicação e a divisão dos números lidos.
package projetojava;

import java.util.Scanner;

public class questão1 {
	
	public static void main(String[] args) {

		Scanner n1 = new Scanner(System.in);
		System.out.println("digite um número :");
		double r1 = n1.nextDouble();
	
		Scanner n2 = new Scanner(System.in);
		System.out.println("digite mais um número :");
		double r2 = n2.nextDouble();
	
		double soma = r1 + r2;
		double subtração = r1 - r2; 
		double dividir = soma /2; 
		double multiplicação = r1 * r2 ; 
		System.out.print("a soma é : "+soma );
		System.out.print("a subtração é : "+subtração );
		System.out.print("a divisão é : "+dividir );
		System.out.print("e a multiplicação é : "+multiplicação );
	}
}
