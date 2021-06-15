package exercicio_Apostila_Java_2007;

import java.util.Scanner;

/*Seja o seguinte algoritmo:
início
ler x
ler y
z  (x*y) + 5
se z <= 0 então
resposta  ‘A’
senão
se z <= 100 então
resposta  ‘B’
senão
resposta  ‘C’

fim_se
fim_se
escrever z, resposta
fim

Faça um teste de mesa e complete o quadro a seguir para os seguintes valores: (olhar o ex. 34
na lista de exercícios para visualizar os valores para teste.*/


public class Exc34 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o valor de x: ");
		int x = scn.nextInt();
		
		System.out.print("Informe o valor de y: ");
		int y = scn.nextInt();
		
		float z = (x*y) + 5;
		
		if (z<= 0) {
			System.out.println("Resposta: A");
		}else if(z<= 100) {
			System.out.println("Resposta: B");
		}else {
			System.out.println("Resposta: C");
		}
		
		scn.close();

	}

}
