package exercicio_Apostila_Java_2007;
/*
 38) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */



import java.util.Scanner;

public class Exc38 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int codigoCorreto = 1234;
		int senhaCorreta = 9999;
		
		System.out.print("Informe o código do usuário: ");
		int code = scn.nextInt();
		
		if(code == codigoCorreto) {
			System.out.println("Usuário identificado!");
			
			System.out.print("\nInforme a senha: ");
			int password = scn.nextInt();
			
			if(password == senhaCorreta) {
				System.out.println("Senha correta!");
			}else {
				System.out.println("Senha incorreta, tente novamente!");
			}
			
		}else{
			System.out.println("Usuário inválido, tente novamente!");
		}
		
		
		scn.close();
	}

}
