package Exercicio_Apostila_Java_2007;
import java.util.Scanner;

public class Exc06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a medida da altura do retângulo (cm): ");
		int alt = scn.nextInt();
		System.out.print("Digite a medida da base do triângulo (cm): ");
		int base = scn.nextInt();
		
		int area = base * alt;
		System.out.println("A área deste retângulo é de " + area + "cm²");
		
		scn.close();
		
	}

}
