package explicacoes;

public class TemporizadorJava {

	public static void main(String[] args) throws InterruptedException{
		
		for(int h = 23; h >= 0; h--) {
			for(int m = 59; m > 0; m--) {
				for(int s = 59; s > 0; s--) {
					
					//A cada print, passarão 1s
					Thread.sleep(1000);
					System.out.println(h+":"+m+":"+s);
				}
			}
		}

	}

}
