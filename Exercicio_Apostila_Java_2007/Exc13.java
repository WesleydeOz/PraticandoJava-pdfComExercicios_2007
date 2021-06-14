package Exercicio_Apostila_Java_2007;
import java.util.Scanner; 
public class Exc13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe a nota 1: ");
		double n1 = scn.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		double n2 = scn.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		double n3 = scn.nextDouble();
		
		double mediaPonderada = (n1*2 + n2*3 + n3*5) / 10;
		
		System.out.println("Sua média final é " + mediaPonderada);
		
		scn.close();
	}

}
