package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc33 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scn.nextInt();
		
		System.out.print("Digite mais um número: ");
		int num2 = scn.nextInt();
		
		if(num1 > num2) {
			System.out.println("Primeiro é maior!");
		}else if(num2 > num1) {
			System.out.println("Segundo é maior!");
		}else {
			System.out.println("Números iguais!");
		}	
		scn.close();

	}

}
