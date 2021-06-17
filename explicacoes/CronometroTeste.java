package explicacoes;

//Fonte: Cavina
public class CronometroTeste {

	public static void main(String[] args) throws InterruptedException {
		boolean timer = true;
		int i;
		int c = 60;

		if(timer == true) {
			for(i=0; i <= c; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		if(i == c) {
			i = 0;
			timer = false;
			}
		}
	}
}