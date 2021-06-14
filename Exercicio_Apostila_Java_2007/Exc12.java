package Exercicio_Apostila_Java_2007;
import java.util.Scanner; 
import java.text.DecimalFormat;


public class Exc12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double fTemperatura = scn.nextDouble();
		
		double cTemperatura = (5 * fTemperatura - 160) / 9;
		
		System.out.println("Resultado da conversão: " + formatador.format(cTemperatura) + " °C");
		
		scn.close();
	}

}
