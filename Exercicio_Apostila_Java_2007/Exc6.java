package Exercicio_Apostila_Java_2007;
import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a medida da altura do ret�ngulo (cm): ");
		int alt = scn.nextInt();
		System.out.print("Digite a medida da base do tri�ngulo (cm): ");
		int base = scn.nextInt();
		
		int area = base * alt;
		System.out.println("A �rea deste ret�ngulo � de " + area + "cm�");
		
		scn.close();
		
	}

}
