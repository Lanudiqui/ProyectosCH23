// if (condicion){
//     Bloque código
// } else{}

let edad = parseInt(prompt("Ingrese su edad: "));

if (edad <= 17){
    document.write("Eres menor de edad");
} else if (edad ===18){
    document.write("¡Eres mayor ya!");
} else if (edad > 18) {
    document.write("<h2>Eres mayor de edad</h2>")
} else {
    document.write("Dato incorrecto");
}

