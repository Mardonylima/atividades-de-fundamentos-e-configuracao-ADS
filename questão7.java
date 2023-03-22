//Questão 07. O programa solicitará, além do nome do usuário, o peso e altura e fará o cálculo do
//Índice de Massa Corporal (IMC).
package projetojava;

import java.util.Scanner;
import java.text.DecimalFormat;

public class questão7 {
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");

		System.out.println("digite seu nome :");
		String nome =entrada.next();
		
		System.out.println("imforme seu peso :");
		double peso = entrada.nextDouble();

		System.out.println("imforme sua altura :");
		double altura =entrada.nextDouble();
		
		float imc = (float) ((altura * altura) /peso) ;
		
		System.out.print("seu nome è " + nome );
		System.out.print(", seu peso é " + peso );
		System.out.print(", sua altura é " + altura );
		System.out.print(" e seu imc  é : " + imc );
	}
}
