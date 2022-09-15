package foxzu;

public class MyThread extends Thread {	
	public MyThread(String threadName) {
		super(threadName);
	}
	
	public void run() {
		System.out.println("Comienza thread " + getName());
		
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " " + getName());			
		
		System.out.println("Termina thread " + getName()); 	
	}
}
