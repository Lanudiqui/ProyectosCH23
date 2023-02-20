/* 

¿Qué encontramos en el arbol del DOM?

- Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipualacion DOM //Es un nodo, pero es hijo del title
    </title>


 - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

 - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

 - Attributes: Nodos que dan informacion asociada al tipo de elemento

 - Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


*/

/*Como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (Quese usan en versiones antiguas de JS)

-document.getElementById (botonSuma)
-document.getElementByTagName (<button>)
-document.getElementByClassName(botones)
-

*/

var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("Este es el primer elemento de mi colección de botones", elementoEtiqueta[0]);

var elementoClassName = document.getElementsByClassName("botones");
console.log(elementoClassName);

/*

Métodos recientes

    -document.querySelector(#botonSuma)
    -document.querySelectorAll(.botones)
*/

/*
var unElmento = document.querySelector("#input1");
console.log(unElmento);

var variosElementos = document.querySelectorAll(".botones");
console.log(variosElementos)
*/

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");

/* 
Creacion nodos 

    -document.createElement(tipoNodo)
*/

var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src="https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt= "Foto de perrito feliz";
imagenPerrito.style.width = "150px";


//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

//Actualizar nodos
//1er paso: Identificar el nodo que quiero cambiar (outer)
//2do paso: Modificar el nodo (inner)

var resultadoQueCambia = document.getElementById("resultado");

//Construimos las funciones de nuestra calculadora

function suma(){
    let valor1 = parseInt(input1.value); //pido número 1
    let valor2 = parseInt(input2.value); //pido número 2
    let suma = valor1 + valor2; // calculo suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta(){
    let valor1 = parseInt(input1.value); //pido número 1
    let valor2 = parseInt(input2.value); //pido número 2
    let resta = valor1 - valor2; // calculo resta
    resultado.innerHTML = resta; //pongo el resultado en su lugar
}

function multiplicacion(){
    let valor1 = parseInt(input1.value); //pido número 1
    let valor2 = parseInt(input2.value); //pido número 2
    let multiplicacion = valor1 * valor2; // calculo multiplicacion
    resultado.innerHTML = multiplicacion; //pongo el resultado en su lugar
}

function division(){
    let valor1 = parseInt(input1.value); //pido número 1
    let valor2 = parseInt(input2.value); //pido número 2
    let division = valor1 / valor2; // calculo division
    resultado.innerHTML = division; //pongo el resultado en su lugar
}

/*como se crea un evento (addEventListener)

    -node.addEventListener ("evento a escuhcar", lo que quiero que haga )

        -node (nodo donde aterrizo el evento)
        -addEventListener ( palabra reservada para usar el veneto)
        -evento a escuchar (click, etc)
        -lo que quiero que haga (la llamada de la función)

*/

botonSuma.addEventListener("click",suma);
botonResta.addEventListener("click",resta);
botonMultiplicacion.addEventListener("click",multiplicacion);
botonDivision.addEventListener("click",division);

resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";

/*
Manipulación del DOM

    -Métodos para acceder a elementos
        -document.getElementById
        -document.getElementByTagName
        -document.getElementByClassName    
    -Metodos para crear elementos
        -document.createElement(etiqueta)
        -document.createTextNode(texto) ***INVESTIGAR****
    -Metodos para insertar elementos
        -parentElement.append
        -parentElement.insertBefore
        -parentElement.insertAdjacentElement
    -Metodos para modificar elementos
        -node.outerHTML (Leer o referenciar el elemento)
        -node.innerHTML (modificar el elemneto)

*/

//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color = color;
}

