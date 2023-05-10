package threads;

public class Thread1 extends Thread {

	char symbol;

	public Thread1(char symbol) {
		super();
		this.symbol = symbol;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(symbol);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
