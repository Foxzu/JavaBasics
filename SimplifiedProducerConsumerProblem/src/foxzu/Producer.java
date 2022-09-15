package foxzu;

import java.util.List;

public class Producer implements Runnable {

	static final int SLEEP_MILIS = 4000;

	private List<String> products;
	
	public Producer(List<String> products) {
		this.products = products;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(SLEEP_MILIS);
			
			synchronized(this.products) {
				System.out.println("PRODUCTOR: sección crítica, cogemos el monitor");
				this.products.add("Producto");
				this.products.notify();
				System.out.println("PRODUCTOR: he añadido un producto a la lista. Fin de la sección crítica, liberamos el monitor");
			};
		} catch (Exception e) {
			
		}
		
	}

}
