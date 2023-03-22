//Questão 06. Elabore um programa que imprima o antecessor e posterior de um número.
package projetojava;

import java.util.Scanner;

public class questão6 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("digite um número :");
		int numero = entrada.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.print("o  número é :" + numero);
		System.out.print(", o  antecessor é :" + antecessor);
		System.out.print(" e o sucessor é :" + sucessor);

	}
}
