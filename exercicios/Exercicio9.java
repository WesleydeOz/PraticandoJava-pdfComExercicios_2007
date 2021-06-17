package exercicios;
import java.util.Scanner;

public class Exercicio9{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida da altura do paralelogramo (cm): ");
		double alt = scn.nextInt();
		
		System.out.print("Informe a a medida da base do paralelogramo (cm): ");
		double base = scn.nextInt();
		
		double area = base * alt;
		
		System.out.println("A área deste paralelogramo é de " + area + "cm²");
		scn.close();
	}

}
