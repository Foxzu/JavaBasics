package foxzu;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		Producer producer = new Producer(products);
		Consumer consumer = new Consumer(products);
		
		Thread thread1 = new Thread(consumer);
		Thread thread2 = new Thread(consumer);
		Thread thread3 = new Thread(consumer);
		Thread thread4 = new Thread(producer);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();	

	}

}
