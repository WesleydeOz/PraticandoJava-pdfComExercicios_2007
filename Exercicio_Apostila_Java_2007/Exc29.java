package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc29 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Escreva 3 números diferentes\n\n");
		
		System.out.print("Escreva o primeiro número: ");
		int num1 = scn.nextInt();

		System.out.print("Escreva o segundo número: ");
		int num2 = scn.nextInt();

		System.out.print("Escreva o terceiro número: ");
		int num3 = scn.nextInt();

		//Considerando num1 a variável com o menor valor
		/*E considerando as duas possibilidades em que num2 e num3
		  serão as duas variáveis com o maior valor*/
		if((num1 < num2 && num2 < num3) || (num1 < num3 && num3 < num2)){
			int soma = num2 + num3;
			System.out.println("O resultado da soma é: " + soma);
			
		//Considerando num2 a variável com o menor valor
		/*E considerando as duas possibilidades em que num1 e num3
		  serão as duas variáveis com o maior valor*/
		}else if((num2 < num1 && num1 < num3) || (num2 < num3 && num3 < num1)){
			int soma = num1 + num3;
			System.out.println("O resultado da soma é: "+ soma); 
			
		//Considerando num3 a variável com o menor valor
		/*E considerando as duas possibilidades em que num1 e num2
		  serão as duas variáveis com o maior valor*/			
		}else if((num3 < num1 && num1 < num2) || (num3 < num2 && num2 < num1)){
			int soma = num1 + num2;
			System.out.println("O resultado da soma é: "+ soma);
		}
		
		scn.close();

	}

}
