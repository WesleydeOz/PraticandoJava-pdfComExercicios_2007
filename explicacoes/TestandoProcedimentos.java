package explicacoes;

import java.util.Scanner;

public class TestandoProcedimentos {
	
	//Exemplo de procedimento, pois não retorna nada. O System.out.println não é retorno, pois já é um comando dentro do método.
	static void soma() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num1 = scn.nextInt();
		System.out.print("Digite outro valor: ");
		int num2 = scn.nextInt();
		int soma = num1 + num2;
		System.out.println("Resultado: " + soma);
		scn.close();
	}

	public static void main(String[] args) {
		System.out.println("Você realizará uma soma abaixo: ");
		soma();
		
	}

}
