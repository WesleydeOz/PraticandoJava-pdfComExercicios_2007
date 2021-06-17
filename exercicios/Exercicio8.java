package exercicios;
import java.util.Scanner;

public class Exercicio8{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Infome a medida do raio do círculo (cm): ");
		double raio = scn.nextInt();
		
		double area =  3.14159 * (raio*raio);
		
		System.out.println("A área do cículo é de: " + area + " cm²");

		scn.close();
	}

}
