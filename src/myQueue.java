
public class myQueue {
	private static class Node {
		private int val;
		Node next;
		Node prev;
		Node(int v, Node next, Node prev) {
			val = v; this.next = next; this.prev = prev;
		}
	}
	private Node head;
	
	public myQueue(){
		head = null;
	}
	
	public void enqueue(int v) {
		head = new Node(v, head, null);
		if (head.next != null)
			head.next.prev = head;
	}
	
	public int dequeue() {
		Node p = head;
		while (p.next != null) {
			p = p.next;
		}
		Node temp = p;
		p.prev.next = null;
		return temp.val;
	}
	public int size() {
		int i = 0;
		for (Node p = head;  p != null; p = p.next) {
			i++;
		}
		return i;
	}
	
	public static void main(String[] a){
		myQueue i = new myQueue();
		i.enqueue(105);
		System.out.println(i.dequeue());
	}
}
