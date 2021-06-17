package explicacoes;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		for(int contador = 0; contador <= 100; contador++) {
			System.out.println(contador);
		}
		
		System.out.println("Incremento de 2 em 2: ");
		
		for(int contador = 0; contador <= 100; contador+=2) {
			System.out.println(contador);
		}
	}

}
