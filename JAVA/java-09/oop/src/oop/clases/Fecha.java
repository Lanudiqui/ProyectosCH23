package oop.clases;

public class Fecha {
	private int año;
	private int mes;
	private int dia;
	
	
	
	
	
	public Fecha() {
		super();
	}




	public Fecha(int año, int mes, int dia) {
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	
	

	
	public String diaMesAño () {
		return "La fecha es : " + this.dia + " " + this.mes + " " + this.año;
	} 
	
	
	
	
	
	//Este metodo se va a reedefinir , @ sobreescribe un metodo que se esta heredando
	@Override
	public String toString() {
		return "Fecha [año=" + año + ", mes=" + mes + ", dia=" + dia + "]";
	}




	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	
	
	
	
	
}
