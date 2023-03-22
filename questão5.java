//Questão 05. A padaria da FPB vende certa quantidade de pães franceses e uma
// quantidade de broas a cada dia. Cada pãozinho custa R$ 0.12 e a broa custa R$ 1.50.
// Ao final do dia, o dono quer saber o quanto arrecadou com as vendas dos pães e das
// broas, o mesmo deve guardar 10% do que arrecadou na poupança. Desenvolva um
// programa para informar ao dono o valor arrecado, bem como o valor a ser
// depositado.
package projetojava; 

import java.text.DecimalFormat;
import java.util.Scanner;

public class questão5 {
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.00");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantos pães foram vendidos ? ");
		int quantiap = entrada.nextInt();
		double lucrop = (double) quantiap * 0.12; 
		
		System.out.println(" quantas broas foram vendidas ?");
		int quantiab = entrada.nextInt();
		double lucrob = (double) quantiab * 1.50;
		
		double lucrot = lucrop + lucrob;
		double dezporcento = lucrot / 10;
		
		System.out.print("você lucrou " + lucrop + " reais com pão. \n");
		System.out.print(", você lucrou " + lucrob + " reais com broa. \n");
		System.out.print(", você lucrou " + lucrot + " reais total. \n");
		System.out.print(" e 10% disso é igual a  " + dezporcento + " reais. \n");

	}	
}
