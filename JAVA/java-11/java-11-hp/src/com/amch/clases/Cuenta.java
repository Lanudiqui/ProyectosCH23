package com.amch.clases;

public class Cuenta {
	protected float saldo;
	protected int numConsignaciones;
	protected int numRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;

	public Cuenta(float saldo, float tasaAnual) {
		saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public void consignar(float cantidad) {
		saldo += cantidad;
		numConsignaciones++;
	}

	public void retirar(float cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
			numRetiros++;
		} else {
			System.out.println("No se puede retirar más dinero del que tiene en la cuenta.");
		}
	}

	public void calcularInteres() {
		float interes = saldo * tasaAnual / 12 / 100;
		saldo += interes;
	}

	public void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
		numConsignaciones = 0;
		numRetiros = 0;
	}

	public void imprimir() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Número de consignaciones: " + numConsignaciones);
		System.out.println("Número de retiros: " + numRetiros);
		System.out.println("Tasa anual: " + tasaAnual);
		System.out.println("Comisión mensual: " + comisionMensual);
	}

}
