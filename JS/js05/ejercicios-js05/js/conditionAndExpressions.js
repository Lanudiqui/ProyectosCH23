var names = ["Maria", "Antony", "Joy", "Juan"];
//Write a function to insert a name to the end of the list. Add your own name to the end of the list.
var myname= names.push("Alejandro");
console.log(names);
//Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.

var search = prompt("Ingrese el nombre que desea buscar: ");
console.log(names.includes(search));

//Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.
var newNames = ["Karen","Carmen","Fernanda","David","José"]
var people = names.concat(newNames);
console.log("La nueva lista de nombres es: " + people);
//Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function
//console.log("")

/************************EJERCICIO-02****************************************/
//What do the following expressions evaluate to?
false || (true && false); //false
true || (11 + 12); //true
(31 + 22) || true; //true
true && (1 + 7);
false && (3 + 4); //false
(1 + 2) && true;
(32 * 4) >= 129; //false
false !== !true;
true === 4; //false
false === (847 === '847'); //false
false === (887 == '887'); //false 
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;

/************************EJERCICIO-03****************************************/

let numero = parseInt(prompt("Ingrese un número: "));

if(numero >=0 && numero <=25){
    console.log(numero + " está entre 0 y 25" )
} else if(numero>=26 && numero<=100){
    console.log(numero + " está entre 26 y 100" )
} else if(numero > 100){
    console.log(numero + " es mayor que 100")
}else {
    console.log(numero + " es menor que 0")
}

/************************EJERCICIO-04****************************************/
var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;

console.log(f); //Va a imorimir un 4
