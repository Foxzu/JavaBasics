package foxzu;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejemplo de ejecución de hilos implementando la interfaz Runnable");
		System.out.println("Comienza thread main"); 
		
		new Thread (new MyThread(), "Dana").start();
		new Thread (new MyThread(), "Sully").start();
		
		System.out.println("Termina thread main"); 
	}
}
