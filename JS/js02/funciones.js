// var a=parseInt(prompt("Ingrese un valor entero para a : "));
// var b=parseInt(prompt("Ingrese un valor entero para b : "));

// function suma(a,b){
//     return (a+b);
// }

// function resta(a,b){
//     return (a-b);
// }

// function multiplicacion(a,b){
//     return (a*b);
// }

// function division(a,b){
//     return (a/b);
// }

/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/

    /*
    Cosas importantes para crear funciones
    
    -Nombre que sea descriptivo y evoque al funcionamineto de ese bloque de codigo
    -Datos de entrada (parametros)
    -Procesos o instrucciones a ejecutar 
    -Salida (return)
    
    */
    //Funcion directa
    function agregarCarritoCompra(){
        //Lo que hade mi función
    }

    //Invocar función
    agregarCarritoCompra()

    //Funcion anonima

    let x = function(){
        let valor1= 5;
        let valor2= 7;
        let suma = valor1+valor2;
        console.log("Esta función anonima: ",suma);
    }

    x();

    //scope es el alcance de nuestra funcion

    //Funcion
    function division01(parametro1,parametro2){
        let resultado = parametro1/parametro2;
        console.log(division01())
    }

    /*
    Tipos de Funciones:
    -Funciones directas - nombre (comunes)
    -Funciones anonimas - viven pegadas a una variable o constante 
    -Funciones como metodos (para especificar que hace mi objeto)
    -Funciones como constructores (para construir o crear un objeto)
    
    
    */

    //Funciones flecha
    
    //Sintaxis de una funcion flecha

    //Funcion directa o normal
    // function suma(a,b){
    //     let sum1 = a + b
    //     console.log(suma1)

    //}

    //Funcion flecha 
    // const suma=(a,b) => a + b;

    //Funcion flecha con mas lineas de codigo
    const sumarYMultiplicar = (a,b) => {
        const sum= a + b;
        const result = suma * 2;
        console.log(result);
    }

    /*

Return

La sentencia return finaliza la ejecucion de la funcion, 
y especifica un valor para ser devuelto a quien llama a la 
funcion. O lo que es lo mismo, usamos return para finalizar
 y tambien para poder asignar el resultado a una variable.


*/

function areaCuadrado(){
    let lado =5;
    let area = lado * lado;
    console.log("El area de mi cuadrado es: ", area);
    return area;
}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();

console.log("El resultado de mi función es: ", resultadoDeMiFuncion);