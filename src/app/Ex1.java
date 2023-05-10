package app;

import threads.Thread1;

public class Ex1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1('*');
		Thread1 t2 = new Thread1('#');
		t1.start();
		t2.start();
	}

}
