package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc30 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Escreva 3 números diferentes\n\n");
		
		System.out.print("Escreva o primeiro número: ");
		int num1 = scn.nextInt();

		System.out.print("Escreva o segundo número: ");
		int num2 = scn.nextInt();

		System.out.print("Escreva o terceiro número: ");
		int num3 = scn.nextInt();
		
		if(num1 < num2 && num2 < num3){ 
			System.out.println(num1 + ", " + num2 + " e " + num3);
	
		}else if(num1 < num3 && num3 < num2) {
			System.out.println(num1 + ", " + num3 + " e " + num2);
			
		}else if(num2 < num1 && num1 < num3) {
			System.out.println(num2 + ", " + num1 + " e " + num3);
			
		}else if(num2 < num3 && num3 < num1) {
			System.out.println(num2 + ", " + num3 + " e " + num1);
			
		}else if(num3 < num1 && num1 < num2) {
			System.out.println(num3 + ", " + num1 + " e " + num2);
			
		}else if(num3 < num2 && num2 < num1){
			System.out.println(num3 + ", " + num2 + " e " + num1);
		}
		
		scn.close();

	}

}
