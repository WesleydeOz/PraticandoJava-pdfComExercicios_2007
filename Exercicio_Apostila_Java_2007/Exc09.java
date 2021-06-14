package Exercicio_Apostila_Java_2007;
import java.util.Scanner;

public class Exc09 {
	
	double reajuste;

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Informe seu salário atual (R$): ");
	double salarioAtual = scn.nextDouble();
	
	System.out.print("Informe o valor do reajuste em %: ");
	double reajuste = scn.nextInt();
	
	double reajustePercent = reajuste / 100;
	
	double calcReajuste = salarioAtual + salarioAtual*reajustePercent; 
	
	System.out.println("Seu sálario reajustado será de " + calcReajuste + " reais.");
	
	scn.close(); 
	}

}
