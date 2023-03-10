package hilos.amch.test;

import hilos.amch.formaThread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		
		Thread h = new Hilo1("Alejandro");
		h.start();
		Thread h1 = new Hilo1("Carmen");
		h1.start();
		Thread h2 = new Hilo1("Pepe");
		h2.start();
		
		
		
		System.out.println(h.getState());

	}

}
