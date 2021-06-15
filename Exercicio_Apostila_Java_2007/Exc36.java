package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc36 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a idade do homem 1: ");
		int h1 = scn.nextInt();
		
		System.out.print("Informe a idade do homem 2: ");
		int h2 = scn.nextInt();
		
		System.out.print("Informe a idade da mulher 1: ");
		int m1 = scn.nextInt();
		
		System.out.print("Informe a idade da mulher 2: ");
		int m2 = scn.nextInt();
		
		if(h1 > h2 && m1 > m2) {
			
			int soma = h1 + m2;
			double prod = h2 * m1;
			System.out.println("Restultado da soma: "+soma);
			System.out.println("Resultado da multiplicação "+prod);
			
		}else if(h1 > h2 && m2 > m1) {
			
			int soma = h1 + m1;
			double prod = h2 * m2;
			System.out.println("Restultado da soma: "+soma);
			System.out.println("Resultado da multiplicação "+prod);
			
		}else if(h2 > h1 && m1 > m2) {
			
			int soma = h2 + m2;
			double prod = h1 * m1;
			System.out.println("Restultado da soma: "+soma);
			System.out.println("Resultado da multiplicação "+prod);
			
		}else if(h2 > h1 && m2 > m1) {
			
			int soma = h2 + m1;
			double prod = h1 * m2;
			System.out.println("Restultado da soma: "+soma);
			System.out.println("Resultado da multiplicação "+prod);
			
		}
		
		
		scn.close();

	}

}
