package Exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Escreva a seguir dois valores inteiros e distintos.");
		
		System.out.print("Valor 1: ");
		int num1 = scn.nextInt();
		
		System.out.print("Valor 2: ");
		int num2 = scn.nextInt();
		
		if(num1 > num2) {
			System.out.println("O valor 1 é maior do que o valor 2.");
		}
		else if(num2 > num1) {
			System.out.println("O valor 2 é maior do que o valor 1.");
		}
		else {
			System.out.println("Erro: os valores informados não podem ser iguais!");
		}
		
		scn.close();

	}

}
