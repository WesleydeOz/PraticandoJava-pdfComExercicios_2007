package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc27 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro qualquer: ");
		int num = scn.nextInt();
		
		if(num > 0) {
			System.out.println("N�mero positivo!");
		}else if (num < 0){
			System.out.println("N�mero negativo!");
		}else{
			System.out.println("Igual a 0!");
		}
		
		
		
		scn.close();
	}

}
