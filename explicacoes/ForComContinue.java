package explicacoes;

public class ForComContinue {

	public static void main(String[] args) {
	int i = 0;
		
		for(i=0; i<=10; i++) {
			if(i == 7) {
				continue;//O 7 se torna exceção
			}
			System.out.println(i);
		}

	}

}
