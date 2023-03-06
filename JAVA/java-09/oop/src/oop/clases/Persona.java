package oop.clases;

public class Persona {
	public String nombre = "Alejandro";
	private int edad;
	private double altura;
	private double peso;
	private String zodiac;
	
	
	public String datorPersona () {
		return this.nombre + " " + this.edad 
				+ " " + this.altura + " " + this.peso 
				+ " " + this.zodiac;  
	}
	
	
	public Persona(int edad, String zodiac) {
		super();
		this.edad = edad;
		this.zodiac = zodiac;
	}


	public Persona() {
	}
	
	


	public Persona(String nombre) {
		this.nombre = nombre;
	}


	public Persona(String nombre, int edad, double altura, double peso, String zodiac) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiac = zodiac;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getZodiac() {
		return zodiac;
	}
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}
	
	
	
}
