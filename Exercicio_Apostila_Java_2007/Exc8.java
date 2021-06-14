package Exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc8 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de eleitores: ");
		double eleitores = scn.nextDouble();
		
		System.out.print("Informe a quantidade de votos brancos: ");
		double votosBrancos = scn.nextDouble();
		
		System.out.print("Informe a quantidade de votos nulos: ");
		double votosNulos = scn.nextDouble();
		
		System.out.print("Informe a quantidade de votos válidos: ");
		double votosValidos = scn.nextDouble();
		
		double VB = votosBrancos/eleitores * 100;
		double VN = votosNulos/eleitores * 100;
		double VV = votosValidos/eleitores * 100;
		
		
		System.out.println("A relação de votos brancos, nulos e válidos, em relação ao total de eleitores, é, respectivamente, de " + VB + "%, " + VN + "%, " + VV + "%");
		
		scn.close();
	}
	
	
}
