package foxzu;

public class MyThread extends Thread {	
	public MyThread(String threadName) {
		super(threadName);
	}
	
	public void run() {
		String threadName = getName();
		
		System.out.println("Comienza thread " + threadName);
		
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " " + getName());			
		
		System.out.println("Termina thread " + threadName); 	
	}
}
