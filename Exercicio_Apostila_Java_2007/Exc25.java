package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc25 {
	
	
	static void calcular() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o número de sua conta bancária: ");
		int numConta = scn.nextInt();
		
		System.out.print("Informe o saldo: R$");
		int saldo = scn.nextInt();
		

		System.out.print("Informe o valor debitado: R$");
		double debito = scn.nextInt();


		System.out.print("Informe o valor de crédito: R$");
		double credito = scn.nextInt();
		
		double saldoAtual = saldo - debito + credito;
		
		System.out.println("O saldo da conta de n° " + numConta + " é de: R$" + saldoAtual + "\n");
		scn.close(); 
		
		if(saldoAtual >= 0) {
			System.out.println("Seu saldo é positivo!");
		}else {
			System.out.println("Seu saldo é negativo!");
		}
	}

	public static void main(String[] args) {		
		System.out.println("Insira os dados necessários abaixo: \n");
		
		calcular();
	}
}
