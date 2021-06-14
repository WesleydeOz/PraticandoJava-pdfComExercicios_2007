package Exercicio_Apostila_Java_2007;
import java.util.Scanner;
public class Exc10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o custo de fábrica do veículo: R$");
		double fabPreco = scn.nextDouble();
		
		double distribuidor = fabPreco * 0.45;
		double impostos = fabPreco * 0.28;
		
		double precoFinal = fabPreco + distribuidor + impostos;
		
		System.out.println("O preço final do veículo será de R$" + precoFinal);
		
		scn.close();

	}

}
