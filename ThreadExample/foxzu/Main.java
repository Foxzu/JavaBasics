package foxzu;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("COMIENZA THREAD MAIN");
		
		new MyThread("Dana").start();
		new MyThread("Sully").start();
		
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " Main");	
		
		System.out.println("TERMINA THREAD MAIN"); 
	}
}
