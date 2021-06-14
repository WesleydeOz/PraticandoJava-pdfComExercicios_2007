package Exercicio_Apostila_Java_2007;
import java.util.Scanner; 

public class Exc11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe seu salário fixo: R$");
		double salarioFixo = scn.nextDouble();
		
		System.out.print("Informe o valor total das vendas deste mês: R$");
		double vendasValorTotal = scn.nextDouble();
		
		System.out.print("Informe o valor fixo ganho por unidade vendida: R$");
		double vendasValorFixo = scn.nextDouble();
		
		System.out.print("Informe a quantidade de veículos vendidos este mês: ");
		int vendasUnidades = scn.nextInt();
		
		double comissaoFixa = vendasValorFixo * vendasUnidades;
		double comissaoVariavel = vendasValorTotal * 0.05;
		
		double salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;
		
		System.out.println("Seu salário final este mês será de R$" + salarioFinal);
		
		scn.close();
	}

}
