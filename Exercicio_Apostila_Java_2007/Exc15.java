package Exercicio_Apostila_Java_2007;
import java.util.Scanner;
public class Exc15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro: ");
		int num = scn.nextInt();
		
		if(num >= 0) {
			System.out.println("Este n�mero � positivo!");
		}
		else{
			System.out.println("Este n�mero � negativo!");
		}

		scn.close();
	}

}
