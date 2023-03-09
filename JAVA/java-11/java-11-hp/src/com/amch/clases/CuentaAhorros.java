package com.amch.clases;

public class CuentaAhorros extends Cuenta {
	protected boolean activa;

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if (saldo >= 10000) {
            activa = true;
        } else {
            activa = false;
        }
	}
	
	 public void retirar(float cantidad) {
	        if (activa) {
	            super.retirar(cantidad);
	            if (saldo < 10000) {
	                activa = false;
	            }
	        } else {
	            System.out.println("La cuenta de ahorros está inactiva.");
	        }
	    }
	 
	 public void extractoMensual() {
	        if (numRetiros > 4) {
	            comisionMensual += (numRetiros - 4) * 1000;
	        }
	        super.extractoMensual();
	        if (saldo >= 10000) {
	            activa = true;
	        } else {
	            activa = false;
	        }
	    }

	    public void imprimir() {
	        super.imprimir();
	        System.out.println("Actividad de la cuenta: " + (activa ? "Activa" : "Inactiva"));
	    }

	

}
