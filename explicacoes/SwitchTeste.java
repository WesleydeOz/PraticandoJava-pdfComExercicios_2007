package explicacoes;

import java.util.Scanner;

public class SwitchTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Abaixo, informe qual n�mero do m�s em que voc� nasceu!\n");
		
		System.out.print("Insira aqui o n�mero do m�s: ");
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
			System.out.println("Mar�o: solit�rio(a) e introvertido(a)!");
		break;
		case 4:
			System.out.println("Abril: desta receber ordens!");
		break;
		case 5:
			System.out.println("Maio: odeia a solid�o!");
		break;
		case 6:
			System.out.println("Junho: organiza��o � um ponto forte!");
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
			System.out.println("Outubro: n�o gosta de confrontos!");
		break;
		case 11:
			System.out.println("Novembro: esconde o que sente!");
		break;
		case 12:
			System.out.println("Dezembro: coragem e humildade!");
		break;
		default:
			System.out.println("Lament�vel hein! Informe um m�s correto por favor!");
	
		
		}
	}

}
