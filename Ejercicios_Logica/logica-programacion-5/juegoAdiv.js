function saltarlinea(){
    document.write("<br>");
    document.write("<br>");
    document.write("<br>");
}

function imprimir(frase){
    document.write(frase)
    saltarlinea();
}

var numeroPensado = Math.round(Math.random()*100);
var intentos = 5;
var contador = 1;


while(contador <= intentos){

    var numeroLanzado = parseInt(prompt("Ingrese un número entre 0-100"));

    if (numeroPensado == numeroLanzado){
        alert("Usted acerto, en el intento " + contador + " el número pensado era " + numeroPensado);
        break;
    }

    else{

        alert("Usted erró")


    }

    contador++;
}

if (numeroPensado == numeroLanzado){
        imprimir("Usted acerto, en el intento " + contador + " el número pensado era " + numeroPensado);

    }

    else{

        imprimir("Usted erró, el numero pensado era " + numeroPensado);


    }

imprimir("FIN")