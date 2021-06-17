package exercicios;
import java.util.Scanner;

public class Exercicio10{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida da altura do triângulo (cm): ");
		double alt = scn.nextInt();
		
		System.out.print("Informe a medida da base do triângulo (cm): ");
		double base = scn.nextInt();
		
		double area = base * alt / 2;
		
		System.out.println("A área deste triângulo é de " + area + "cm²");
		scn.close();
	}

}

