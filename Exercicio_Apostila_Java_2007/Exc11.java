package Exercicio_Apostila_Java_2007;
import java.util.Scanner; 

public class Exc11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe seu sal�rio fixo: R$");
		double salarioFixo = scn.nextDouble();
		
		System.out.print("Informe o valor total das vendas deste m�s: R$");
		double vendasValorTotal = scn.nextDouble();
		
		System.out.print("Informe o valor fixo ganho por unidade vendida: R$");
		double vendasValorFixo = scn.nextDouble();
		
		System.out.print("Informe a quantidade de ve�culos vendidos este m�s: ");
		int vendasUnidades = scn.nextInt();
		
		double comissaoFixa = vendasValorFixo * vendasUnidades;
		double comissaoVariavel = vendasValorTotal * 0.05;
		
		double salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;
		
		System.out.println("Seu sal�rio final este m�s ser� de R$" + salarioFinal);
		
		scn.close();
	}

}
