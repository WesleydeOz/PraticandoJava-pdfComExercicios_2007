package Exercicio_Apostila_Java_2007;
import java.util.Scanner;
public class Exc16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de ma��s que deseja comprar: ");
		int quantidade = scn.nextInt();
		
		if(quantidade >= 12) {
			int precoFinal = quantidade; //N�o mudaria o resultado final multiplicar 'quantidade' por 1
			System.out.print("Pre�o total da compra: R$" + precoFinal);
		}
		
		else if(quantidade < 12 && quantidade > 0) {
			double precoFinal = quantidade * 1.30;
			System.out.println("Pre�o total da compra: R$" + precoFinal);
		}
		
		else {
			System.out.println("Erro: informe uma quantidade acima de 0.");
		}
		
		
		scn.close();
	}

}
