package Exercicio_Apostila_Java_2007;

import java.util.Calendar;
import java.util.Scanner;

public class Exc18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.print("Informe em qual ano voc� nasceu: ");
		int anoDeNasc = scn.nextInt();
		
		int idade = anoAtual - anoDeNasc;
		
		
		//Considerei a idade m�nima na qual o voto se torna obrigat�rio
		if(idade >= 18) {
			System.out.println("Voc� poder� votar este ano!");
		}
		else {
			System.out.println("Voc� n�o poder� votar este ano!");
		}
		
		scn.close();
	}

}
