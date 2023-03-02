package Funciones;

public class Funciones {//clase llamada funcion
	
	//Las funciones se pueden declarar en cualquier lugar de la clase
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}//cierre sumar
	
	public static int restar (int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}//cierre restar
	
	public static int multiplicacion (int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}//cierre multiplicacion
	
	public static int dividir (int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	}//cierre dividir
	
	//Funcion tipo void
	public static void imprimirAsteriscos() {
		System.out.println("******************************");
	}//cierre impirmir asteriscos
	
	
	//Funcion que combina distintos tipos de valores
	public static float sumaDecimal (float valor1, int valor2) {
		return valor1 + valor2;
	}//cierre 
	
	
	
	
	
	//Este metodo tiene como funcion, ejecutar cosas.
	public static void main(String[] args){
		
		//Lasinvocamos de la función se hacen generalmente dentro del metodo principal o main
		
		System.out.println("El resultado de la suma es: " + sumar(5,8));
		imprimirAsteriscos();
		System.out.println("El resultado de la sima decimal es: " + sumaDecimal(5.7f,5));
		
		
		//Funciones de la biblioteca de Math
		
		double valorEjemplo = 7.65497834d;
		
		System.out.println("La raiz cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de  mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de  mi valor es: " + Math.pow(valorEjemplo, 2));
		
		
		
		//EJERCICIO ANGULOS
		
		double angulo = 30; // angulo 
		double ar = Math.toRadians(angulo);// Se pasa de grados a radianes para funcion tan
		double distancia = 100; // 
		double h = distancia * (Math.tan(ar)); // se calcula la altura de la torre 
		
		System.out.println("La altura de la torre es: " + h);
		
		
		
	}//cierre metodo main 

}

/*
 * Funciones
 * 
 * -No retornar valores: No devuleven nada, no se especifica nada,
 *  y no usamos la palabra return
 * -Si retornan valores: Se especifica el tippo de dato del argumento,
 *  el tipo de valor que regresa y se usa return para esto
 *  
 *  
 *  - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
     
     
     
     
     Cosas que debemos tomar en cuenta al momento de crear nuestras funciones:
    - Deben de llevar un nombre unico
    - Opcionalmente podran recibir argumentos y devolver el resultado
    - Se debe especificar el tipo de dato que vamos a pasar como argumnto, y el resultado final de nuestra funcion
    - Cuidar el orden en como estamos agregando nuestros parametros o argumentos.
 *  
 *  
 *  
 *  
 * */
 