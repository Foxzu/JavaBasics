package foxzu;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejemplo de ejecución de hilos extendiendo la clase Thread");
		System.out.println("COMIENZA THREAD MAIN");
		
		new MyThread("Dana").start();
		new MyThread("Sully").start();
		
		System.out.println("TERMINA THREAD MAIN"); 
	}
}
