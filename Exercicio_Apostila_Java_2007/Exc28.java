package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Escreva 3 n�meros diferentes\n\n");
		
		System.out.print("Escreva o primeiro n�mero: ");
		int num1 = scn.nextInt();

		System.out.print("Escreva o segundo n�mero: ");
		int num2 = scn.nextInt();

		System.out.print("Escreva o terceiro n�mero: \n");
		int num3 = scn.nextInt();

		if(num1 > num2 && num1 > num3){
			System.out.print("O maior n�mero �: " + num1);
		}else if(num2 > num1 && num2 > num3){
			System.out.print("O maior n�mero �: " + num2); 
		}else{
			System.out.print("O maior n�mero �: " + num3);
		}
		
		scn.close();
	}

}
