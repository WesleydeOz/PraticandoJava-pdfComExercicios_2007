package exercicio_Apostila_Java_2007;

import java.util.Scanner;

public class Exc32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Nome do time A: ");
		String timeA = scn.nextLine(); //nextLine permite ler entradas com espaços. ex: arroz doce
		
		System.out.print("Quantidade de gols marcados pelo time A: ");
		int golsA = scn.nextInt();
		
		scn.nextLine();
		
		/*Erro ao tentar usar nextLine: o console pula a pergunta sobre 
		 * o nome do time B e vai direto para a quantidade de gols do time B*/
		
		/*Solução encontrada: adicionar um 'scn.nextLine()'; 
		 * (linha 16) entre a quantidade de gols marcados por A e o nome do time B*/
		
		System.out.print("Nome do time B: ");
		String timeB = scn.nextLine();
		
		System.out.print("Quantidade de gols marcados pelo time B: ");
		int golsB = scn.nextInt();
		
		if(golsA > golsB) {
			System.out.println("Vencedor da partida: "+timeA);
		}else if(golsB > golsA) {
			System.out.println("Vencedor da partida: "+timeB);
		}else{
			System.out.println("Empate!");
		}
		
		scn.close();

	}

}
