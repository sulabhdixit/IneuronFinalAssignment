package ineuronfinalassignment.solution9;

public class ProducerConsumer {

	public static void main(String[] args) {
		{
			Shop c = new Shop();
			Producer p1 = new Producer(c, 1);
			p1.start();
			Consumer c1 = new Consumer(c, 1);
			c1.start();
		}
	}

}
