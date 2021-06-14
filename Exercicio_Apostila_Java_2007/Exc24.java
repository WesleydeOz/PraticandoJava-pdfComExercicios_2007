package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe seu salário fixo: R$");
		double salarioFixo = scn.nextFloat();
		
		System.out.print("Informe o total de vendas deste mês: R$");
		double vendasMes = scn.nextFloat();
		
		double comissaoVendas;
		
		if(vendasMes <= 1500) {
			comissaoVendas = vendasMes*0.03;
		}else{
			comissaoVendas = (vendasMes - 1500) * 0.05 + (1500 * 0.03);
		}
		
		
		/* Declarar double 'comissaoVendas' dentro do If e Else não me permitiu chamá-la dentro de 'salarioFinal'.
		   Solução encontrada: declarar 'comissaoVendas' fora do If e Else. */
		double salarioFinal = comissaoVendas + salarioFixo;
		
		System.out.println("Seu salário no final deste mês será de: R$" + salarioFinal);
		
		scn.close();
	}

}
