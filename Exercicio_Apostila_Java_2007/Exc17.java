package Exercicio_Apostila_Java_2007;
import java.util.Scanner;
public class Exc17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a nota da 1� avalia��o: ");
		double n1 = scn.nextDouble();
		
		System.out.print("Informe a nota da 2� avalia��o: ");
		double n2 = scn.nextDouble();
		
		double mediaFinal = (n1 + n2) / 2;
		
		if(mediaFinal >= 6) {
			System.out.println("Voc� foi aprovado!");
		}
		else {
			System.out.println("Voc� foi reprovado!");
		}

		System.out.println("Sua m�dia final: " + mediaFinal);
		
		scn.close();
	}

}
