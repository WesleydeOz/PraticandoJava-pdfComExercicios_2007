package explicacoes;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int cont = 1;
		while(cont <=3) {
			System.out.print("Informe seu nome: ");
			String nome = scn.next();
			System.out.print("Informe o sexo: ");
			String sexo = scn.next();
			System.out.print("Informe a primeira nota: ");
			double nota1 = scn.nextDouble();
			System.out.print("Informe a segunda nota: ");
			double nota2 = scn.nextDouble();
			System.out.print("Informe a terceira nota: ");
			double nota3 = scn.nextDouble();
			System.out.print("Informe a quarta nota: ");
			double nota4 = scn.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("O(A) aluno(a) "+ nome+ ", de sexo "+sexo+", obteve a média: "+media+"\n");
			
			cont++;
		}
		
		
		scn.close();

	}

}
