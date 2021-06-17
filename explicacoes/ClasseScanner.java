package explicacoes;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scn.nextInt();
		
		System.out.println("O valor digitado pela pessoa corresponde a: " + numero);
		
		scn.close();

	}

}
