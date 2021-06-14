package Exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Informe quantos anos você possui: ");
			int anos = scn.nextInt();
			
			System.out.print("Quantos meses após seu último aniversário ?: ");
			int meses = scn.nextInt();
			
			System.out.print("Quantos dias após seu último mêsversário ?: ");
			int dias = scn.nextInt();
			
			int anoDia = anos * 365;
			int mesesDia = meses * 30;
			
			int resultado = anoDia + mesesDia + dias;
			System.out.println("Sua idade, em dias, é " + resultado);
			
			scn.close();

	}

}
