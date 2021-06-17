package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc37 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de morangos adquiridos (kg): ");
		double morango = scn.nextInt();
		
		System.out.print("Informe a quantidade de maçãs adquiridas (kg): ");
		double maca = scn.nextInt();
		
		double qtdTotal = maca + morango;
		
		double precoMa = 0;
		double precoMo = 0;
		
		if (morango <= 5) {
			precoMo = morango * 2.5;
		}else if (morango > 5){
			precoMo = morango * 2.2;
		}
		
		if (maca <= 5) {
			precoMa = maca * 1.8;
		}else if (maca > 5){
			precoMa = maca * 1.5;
		}
		
		double precoTotal = precoMo + precoMa;
		
		if(qtdTotal > 8 || precoTotal > 25) {
			precoTotal = precoTotal - precoTotal * 0.1;
		}
		
		System.out.println("Preço total: R$"+precoTotal);
		
		scn.close();
	}

}
