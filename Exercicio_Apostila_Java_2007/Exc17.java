package Exercicio_Apostila_Java_2007;
import java.util.Scanner;
public class Exc17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a nota da 1ª avaliação: ");
		double n1 = scn.nextDouble();
		
		System.out.print("Informe a nota da 2ª avaliação: ");
		double n2 = scn.nextDouble();
		
		double mediaFinal = (n1 + n2) / 2;
		
		if(mediaFinal >= 6) {
			System.out.println("Você foi aprovado!");
		}
		else {
			System.out.println("Você foi reprovado!");
		}

		System.out.println("Sua média final: " + mediaFinal);
		
		scn.close();
	}

}
