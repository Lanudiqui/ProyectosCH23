let numero = parseInt(prompt("Ingrese un número entero para concoer su factorial"));
let factorial=1;

if (Number.isNaN(numero) === true){
    document.write("Ingrese un número entero");
} else {
    for(let n = 1; n<= numero; n ++){
        factorial = factorial*n;
    }
    document.write("El factorial de " + numero+ " es " + factorial);
}