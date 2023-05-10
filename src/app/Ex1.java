package app;

import threads.Thread1;
import threads.Thread2;

public class Ex1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
