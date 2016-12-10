package array;

public class Queue {
	private int[] data;
	private int head, tail;
	private void grow() {
		int[] temp = new int[data.length + 1];
		for (int i = 0; i < data.length; i ++){
			temp[i+1] = data[i];
		}
	}
	public Queue(int size) {
		data = new int[size];
		head = tail = 0;
	}
	void enqueue(int v) {
		data[head] = v;
		head = (head + 1) % data.length;
		if (head == tail) {
			grow();
		}
	}
  int dequeue() {
		int v = data[tail];
		tail = (tail + 1) % data.length;
		return v;
	}

	boolean isEmpty() {
		return head == tail;
	}
}
