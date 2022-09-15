package foxzu;

import java.util.List;

public class Consumer implements Runnable {

	private List<String> products;

	public Consumer(List<String> products) {
		this.products = products;
	}
	
	@Override
	public void run() {
		try {
			synchronized(this.products) {
				System.out.println("CONSUMIDOR: sección crítica, cogemos el monitor");
				
				if (this.products.size() == 0) {
					System.out.println("CONSUMIDOR: No hay productos, liberamos el monitor");
					this.products.wait();
				}
							
				this.products.remove(0);
				
				System.out.println("CONSUMIDOR: se ha consumido un producto");
				System.out.println("CONSUMIDOR: fin de la sección crítica, liberamos el monitor");
			}
		} catch (Exception e) {
			
		}
		
		
	}

}
