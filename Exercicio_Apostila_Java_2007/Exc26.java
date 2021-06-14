package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc26 {
	
	static void calcularMediaProduto(){
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a quantidade mínima do produto: ");
		int min = scn.nextInt();
		
		System.out.print("Informe a quantidade máxima do produto: ");
		int max = scn.nextInt();
		
		System.out.print("Informe a quantidade atual do produto: ");
		int atual = scn.nextInt();
		
		double media = (min + max)/2;
		
		if(atual >= media) {
			System.out.println("\nNão efetuar compra!");
		}else {
			System.out.println("\nEfetuar compra!");
		}

		scn.close();
	}

	public static void main(String[] args) {
		System.out.println("Insira os dados abaixo e descubra se será necessário ou não comprar mais unidades do produto x!\n");
		
		calcularMediaProduto();
	}

}
