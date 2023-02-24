package Clases;

public class NuevoHola {
	private String nombre;
	//para inicializar lavariable (objeto de tipo String)
	//usamo el método constructor.

	public NuevoHola(String nombre) {
	
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola desde java con STS otra vez " + this.nombre);
		
	public void saludoConNombre() {
		System.out.println("Hola tu eres " + this.nombre);
			
	}

}
