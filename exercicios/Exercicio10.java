package exercicios;
import java.util.Scanner;

public class Exercicio10{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida da altura do tri�ngulo (cm): ");
		double alt = scn.nextInt();
		
		System.out.print("Informe a medida da base do tri�ngulo (cm): ");
		double base = scn.nextInt();
		
		double area = base * alt / 2;
		
		System.out.println("A �rea deste tri�ngulo � de " + area + "cm�");
		scn.close();
	}

}

