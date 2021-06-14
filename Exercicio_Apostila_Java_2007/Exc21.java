package Exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Considerando o sistema de 24h, informe o hor�rio de in�cio e t�rmino da partida de xadrez (sem minutos e segundos).");
			
		System.out.print("Hor�rio de in�cio: ");
		int h1 = scn.nextInt();
		
		System.out.print("Hor�rio de t�rmino: ");
		int h2 = scn.nextInt();
		
		if(h2 > h1){
			
			int duracao = h2 - h1;
			System.out.println("Dura��o da partida: " + duracao + " hora(s)");
		}
		
		else if(h1 > h2){
			int duracao = 24 - h1 + h2;
			System.out.println("Dura��o da partida: " + duracao + " hora(s)");
		}
		
		else {
			System.out.println("Dura��o m�xima de 24 horas atingida!");
		}
		
		scn.close();
	}

}
