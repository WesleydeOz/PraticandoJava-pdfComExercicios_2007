package exercicio_Apostila_Java_2007;

import java.util.Scanner;

/*Seja o seguinte algoritmo:
in�cio
ler x
ler y
z  (x*y) + 5
se z <= 0 ent�o
resposta  �A�
sen�o
se z <= 100 ent�o
resposta  �B�
sen�o
resposta  �C�

fim_se
fim_se
escrever z, resposta
fim

Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores: (olhar o ex. 34
na lista de exerc�cios para visualizar os valores para teste.*/


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
