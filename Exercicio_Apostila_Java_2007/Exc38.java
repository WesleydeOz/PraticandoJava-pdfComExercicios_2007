package exercicio_Apostila_Java_2007;
/*
 38) Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se
esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a
senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.
 */



import java.util.Scanner;

public class Exc38 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int codigoCorreto = 1234;
		int senhaCorreta = 9999;
		
		System.out.print("Informe o c�digo do usu�rio: ");
		int code = scn.nextInt();
		
		if(code == codigoCorreto) {
			System.out.println("Usu�rio identificado!");
			
			System.out.print("\nInforme a senha: ");
			int password = scn.nextInt();
			
			if(password == senhaCorreta) {
				System.out.println("Senha correta!");
			}else {
				System.out.println("Senha incorreta, tente novamente!");
			}
			
		}else{
			System.out.println("Usu�rio inv�lido, tente novamente!");
		}
		
		
		scn.close();
	}

}
