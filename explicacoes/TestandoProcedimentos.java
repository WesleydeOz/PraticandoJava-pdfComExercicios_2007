package explicacoes;

import java.util.Scanner;

public class TestandoProcedimentos {
	
	//Exemplo de procedimento, pois n�o retorna nada. O System.out.println n�o � retorno, pois j� � um comando dentro do m�todo.
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
		System.out.println("Voc� realizar� uma soma abaixo: ");
		soma();
		
	}

}
