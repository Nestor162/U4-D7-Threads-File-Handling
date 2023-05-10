package threads;

import java.util.List;

public class ThreadArray3 extends Thread {

	private List<Integer> array;
	private int sum;

	public ThreadArray3(List<Integer> array) {
		super();
		this.array = array;
		this.sum = 0;
	}

	public List<Integer> getArray() {
		return array;
	}

	public void setArray(List<Integer> array) {
		this.array = array;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {

		for (int i = 0; i < array.size(); i++)
			sum += array.get(i);
	}
}
