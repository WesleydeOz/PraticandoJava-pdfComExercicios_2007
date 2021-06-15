package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc35 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe se abastecerá com álcool (a) ou gasolina (g): ");
		char combust = scn.next().charAt(0);
		
		if(combust == 'a' || combust == 'A') {
			
			System.out.print("Informe em litros a quantidade desejada: ");
			int l = scn.nextInt();
			
			//Cálculos já com os descontos de 3% e 5%, respectivamente.
			/*Parece que, se eu declarar uma variável dentro do if/else, não posso 
			  utilizá-la fora deles. Por isso o totalA declarado abaixo.*/
			double totalA;
			if(l <=20) {
				totalA = 2.813 * l;
			}else{
				totalA = 2.755 * l;
			}
			
			System.out.println("Total a pagar: R$" + totalA);
			
		}else if(combust == 'g' || combust == 'G'){
				
				System.out.print("Informe em litros a quantidade desejada: ");
				int l = scn.nextInt();
				
				//Cálculos já com os descontos de 4% e 6%, respectivamente.
				double totalG;
				if(l <=20) {
					totalG = 3.168 * l;
				}else {
					totalG = 3.102 * l;
				}
				
				System.out.println("Total a pagar: R$" + totalG);
			
		}else{
			System.out.println("Digite A/a ou G/g !!!!");
		}

		scn.close();
	}

}
