package exercicios;
import java.util.Scanner;

public class Exercicio11{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado do quadrado (cm): ");
		int lado = scn.nextInt();
		
		double area = lado * lado;
		
		System.out.println("A �rea deste quadrado � de " + area + "cm�");
		
		scn.close();
	}

}

