package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc25 {
	
	
	static void calcular() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o n�mero de sua conta banc�ria: ");
		int numConta = scn.nextInt();
		
		System.out.print("Informe o saldo: R$");
		int saldo = scn.nextInt();
		

		System.out.print("Informe o valor debitado: R$");
		double debito = scn.nextInt();


		System.out.print("Informe o valor de cr�dito: R$");
		double credito = scn.nextInt();
		
		double saldoAtual = saldo - debito + credito;
		
		System.out.println("O saldo da conta de n� " + numConta + " � de: R$" + saldoAtual + "\n");
		scn.close(); 
		
		if(saldoAtual >= 0) {
			System.out.println("Seu saldo � positivo!");
		}else {
			System.out.println("Seu saldo � negativo!");
		}
	}

	public static void main(String[] args) {		
		System.out.println("Insira os dados necess�rios abaixo: \n");
		
		calcular();
	}
}
