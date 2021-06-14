package Exercicio_Apostila_Java_2007;
import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro: ");
		int num = scn.nextInt();
		
		if(num > 10) {
			System.out.println("É maior que 10!");
		}
		else if(num < 10) {
			System.out.println("É menor que 10!");
		}
		else {
			System.out.println("É igual a 10!");
		}

		scn.close();
	}

}
