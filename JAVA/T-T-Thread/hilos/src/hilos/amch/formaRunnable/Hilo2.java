package hilos.amch.formaRunnable;

public class Hilo2 implements Runnable {
	private String nombre;
	
	
	public Hilo2(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	@Override
	public void run() {
		
		System.out.println("Inicio del Thread " + this.getNombre());
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i + " " + nombre);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
