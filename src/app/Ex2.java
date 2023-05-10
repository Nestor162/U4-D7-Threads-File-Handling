package app;

import java.util.ArrayList;
import java.util.List;

import threads.ThreadArray1;

public class Ex2 {

	public static void main(String[] args) {

		List<Integer> randomNumbers = new ArrayList<>();

		for (int i = 0; i < 3000; i++) {
			randomNumbers.add((int) Math.floor(Math.random() * 100));
		}

		List<Integer> part1 = randomNumbers.subList(0, 999);
		ThreadArray1 t1 = new ThreadArray1(part1);

		List<Integer> part2 = randomNumbers.subList(999, 1999);
		ThreadArray1 t2 = new ThreadArray1(part2);

		List<Integer> part3 = randomNumbers.subList(2000, 3000);
		ThreadArray1 t3 = new ThreadArray1(part3);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int t1Result = t1.getSum();
		int t2Result = t2.getSum();
		int t3Result = t3.getSum();

		System.out.println("Prima parte: \t" + t1Result);
		System.out.println("Seconda parte: \t" + t2Result);
		System.out.println("Terza parte: \t" + t3Result);

		System.out.println("\nTotale: " + (t1Result + t2Result + t3Result));
	}

}
