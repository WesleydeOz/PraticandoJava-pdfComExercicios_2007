package Exercicio_Apostila_Java_2007;

import java.util.Calendar;
import java.util.Scanner;

public class Exc18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.print("Informe em qual ano você nasceu: ");
		int anoDeNasc = scn.nextInt();
		
		int idade = anoAtual - anoDeNasc;
		
		
		//Considerei a idade mínima na qual o voto se torna obrigatório
		if(idade >= 18) {
			System.out.println("Você poderá votar este ano!");
		}
		else {
			System.out.println("Você não poderá votar este ano!");
		}
		
		scn.close();
	}

}
