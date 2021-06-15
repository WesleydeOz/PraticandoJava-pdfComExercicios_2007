package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Escreva 3 números diferentes\n\n");
		
		System.out.print("Escreva o primeiro número: ");
		int num1 = scn.nextInt();

		System.out.print("Escreva o segundo número: ");
		int num2 = scn.nextInt();

		System.out.print("Escreva o terceiro número: \n");
		int num3 = scn.nextInt();

		if(num1 > num2 && num1 > num3){
			System.out.print("O maior número é: " + num1);
		}else if(num2 > num1 && num2 > num3){
			System.out.print("O maior número é: " + num2); 
		}else{
			System.out.print("O maior número é: " + num3);
		}
		
		scn.close();
	}

}
