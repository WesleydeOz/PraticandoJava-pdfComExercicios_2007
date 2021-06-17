package explicacoes;

import java.util.Scanner;

public class SwitchTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Abaixo, informe qual número do mês em que você nasceu!\n");
		
		System.out.print("Insira aqui o número do mês: ");
		int mes = scn.nextInt();
		scn.close();
		
		switch (mes) {
		
		case 1:
			System.out.println("Janeiro: personalidade forte!");
		break;
		case 2:
			System.out.println("Fevereiro: trabalhador(a)!");
		break;
		case 3:
			System.out.println("Março: solitário(a) e introvertido(a)!");
		break;
		case 4:
			System.out.println("Abril: desta receber ordens!");
		break;
		case 5:
			System.out.println("Maio: odeia a solidão!");
		break;
		case 6:
			System.out.println("Junho: organização é um ponto forte!");
		break;
		case 7:
			System.out.println("Julho: extrovertido(a)!");
		break;
		case 8:
			System.out.println("Agosto: frio(a) e calculista, tipo piki brainder, tlg?");
		break;
		case 9:
			System.out.println("Setembro: perfeccionistas!");
		break;
		case 10:
			System.out.println("Outubro: não gosta de confrontos!");
		break;
		case 11:
			System.out.println("Novembro: esconde o que sente!");
		break;
		case 12:
			System.out.println("Dezembro: coragem e humildade!");
		break;
		default:
			System.out.println("Lamentável hein! Informe um mês correto por favor!");
	
		
		}
	}

}
