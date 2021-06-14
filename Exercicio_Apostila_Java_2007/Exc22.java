package Exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de horas trabalhadas no último mês: ");
		int hMes = scn.nextInt();
		
		System.out.print("Informe o valor recebido por hora trabalhada: ");
		int salHora = scn.nextInt();
		
		if(hMes <= 160) {
			int salarioFinal = salHora * hMes;
			System.out.println("Seu salário final será R$" + salarioFinal);
		}
		
		else {
			int horaExtra = hMes - 160;
			double horaExtraValor = (salHora + salHora*0.5) * horaExtra;
			double salarioFinal = 160 * salHora + horaExtraValor;
			System.out.println("Seu salário final será R$" + salarioFinal);
		}
		
		scn.close();

	}

}
