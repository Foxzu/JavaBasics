package foxzu;

public class MyThread implements Runnable {
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		System.out.println("Comienza thread " + threadName);
		
		for (int i = 0; i < 10 ; i++) 
			System.out.println(i + " " + threadName);
		
		System.out.println("Termina thread " + threadName); 
	}
}
