package game;

public class RandomTimerClass {

	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1*1000);
				System.out.println(i+1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
