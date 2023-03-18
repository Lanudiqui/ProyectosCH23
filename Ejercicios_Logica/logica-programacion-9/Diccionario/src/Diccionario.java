
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		 HashMap<String, String> diccionario = new HashMap<String, String>();
		    Scanner entrada = new Scanner (System.in);
		    
		    diccionario.put("gato", "cat");
		    diccionario.put("perro", "dog");
		    diccionario.put("casa", "house");
		    diccionario.put("carta", "card");
		    diccionario.put("arbol", "tree");
		    diccionario.put("rojo", "red");
		    diccionario.put("amarillo", "yellow");
		    diccionario.put("verde", "green");
		    diccionario.put("azul", "blue");
		    diccionario.put("ordenador", "computer");
		    diccionario.put("raton", "mouse");
		    diccionario.put("mesa", "table");
		    diccionario.put("silla", "chair");
		    diccionario.put("montaña", "mountain");
		    diccionario.put("baloncesto", "basketball");
		    diccionario.put("juego", "game");
		    diccionario.put("caballo", "horse");
		    diccionario.put("mar", "sea");
		    diccionario.put("sonido", "sound");
		    diccionario.put("musica", "music");
		    
		    System.out.println("Introduce una palabra en español para traducirla.");
		    String palabra = entrada.next();
		    
		    if (diccionario.containsKey(palabra)) {
		      System.out.print("La palabra " + palabra + " en ingles es: ");
		      System.out.println(diccionario.get(palabra)+".");
		      } else {
		      System.out.print("La palabra introducida no existe en el diccionario.");
		      } 

	}

}
