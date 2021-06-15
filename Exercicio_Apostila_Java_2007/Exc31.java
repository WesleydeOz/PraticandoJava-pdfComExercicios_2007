package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc31 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite 3 segmentos de reta a seguir!\n");
		
		System.out.print("Digite o segmento AB: ");
		int seg1 = scn.nextInt();

		System.out.print("Digite o segmento BC: ");
		int seg2 = scn.nextInt();

		System.out.print("Digite o segmento CA: ");
		int seg3 = scn.nextInt();

		int soma1 = seg1 + seg2;
		int soma2 = seg2 + seg3;		
		int soma3 = seg3 + seg1;

		//Condição informando que as 3 situações devem ser atendidas para que algo ocorra
		//Nas condições temos a comparação entre um segmento e soma dos outros dois segmentos
		if ((seg1 < soma2) && (seg2 < soma3) && (seg3 < soma1)) {
			System.out.print("\nSerá possível formar um triângulo com estes segmentos.");
			}
			
		else {
			System.out.print("\nNão será possível formar um triângulo com estes segmentos.");
			}
		
		scn.close();
	}

}
