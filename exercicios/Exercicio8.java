package exercicios;
import java.util.Scanner;

public class Exercicio8{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Infome a medida do raio do c�rculo (cm): ");
		double raio = scn.nextInt();
		
		double area =  3.14159 * (raio*raio);
		
		System.out.println("A �rea do c�culo � de: " + area + " cm�");

		scn.close();
	}

}
