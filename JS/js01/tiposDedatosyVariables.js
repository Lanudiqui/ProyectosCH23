var nombre = "Alejandro";
var edad =30;
var tengoMascotas= true;
var tengoTrabajo = false;
var tengoSueldo; //undefined

let nombre0 = "Alejandro";
let edad0 =30;
let tengoMascotas0= true;
let tengoTrabajo0 = false;
let tengoSueldo0; //undefined


/* Calcula el salario trabajado en horas*/
var numeroHoras = parseInt(prompt("Ingrese las horas laboradas: "));
var pagoHora = prompt("Ingrese el coste de la hora: ");
var pagoTotal = (numeroHoras*pagoHora);

/*Resuelve la siguiente operación*/
var a=((3+2)/(2*5));

/*Calcular el IMC*/
var opcion = prompt("Eliga la opción para conocer su peso: 1) Kilogramos  2) Libras");
if (opcion==1){
    var peso=parseFloat(prompt("Ingrese su masa corporal en kg"));
    var altura= parseFloat(prompt("Ingrese su estatura: "));
    var imc = parseFloat(((peso)/(altura*altura)));
    alert("Su IMC es: " + imc)
}else{
    var peso=parseFloat(prompt("Ingrese su masa corporal en kg"));
    var lb = parseFloat((peso*1)/0.453592);
    alert("Su peso en libras es: " + lb +" lb");
    var altura= parseFloat(prompt("Ingrese su estatura: "));
    var cm = parseFloat(altura*100);
    alert("Su estatura en cm es: " + cm +" cm");
    var imc = parseFloat(((peso)/(altura*altura)));
    alert("Su IMC es: " + imc)
}


var mensaje="";


if (imc<16){ 
    mensaje="Criterio de ingreso";
} else if (imc>16 && imc<=16.9){
    mensaje="Infrapeso";        
} else if (imc>17 && imc<=18.4){
    mensaje="Bajo peso";
} else if  (imc>18.5 && imc<=24.9){
    mensaje="Peso normal";
} else if  (imc>25 && imc<=29.9){
    mensaje="Sobrepeso";
} else if (imc>30 && imc<=34.9){
    mensaje="Obesidad premórbida";
} else if (imc>40 && imc<=45){
    mensaje="Obesidad mórbida";
} else if (imc>45){
    mensaje="Obesidad hipermóbida";
}else {
    mensaje="Datos incorrectos";

}
            
    
    




   
