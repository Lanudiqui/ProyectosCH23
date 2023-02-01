let miArreglo = []; //declaración literal
let miArreglo01 = new Array();// declaración por instancia
let miArreglo02 = [31,32,33,34];
console.log("Dato de mi arreglo en el indice 0:", miArreglo02[0]);
console.log("Dato de mi arreglo en el indice 1:", miArreglo02[1]);
console.log("Dato de mi arreglo en el indice 2:", miArreglo02[2]);
console.log("Dato de mi arreglo en el indice 3:", miArreglo02[3]);
console.log("El número de elementos del arreglo 2 es: " + miArreglo02.length);

let miArreglo03 =["que","hola","tal"];
console.log(miArreglo03);
console.log("El número de elementos del arreglo 3 es: " + miArreglo03.length);

let miArreglo04 = [{nombre:"Alejandro"},{apellido:"Morales"},{edad:30}];
console.log("El arreglo del tipo objeto de mi arreglo: "+ miArreglo04[0].nombre);
console.log("El arreglo del tipo objeto de mi arreglo: "+ miArreglo04[1].apellido);
console.log("El arreglo del tipo objeto de mi arreglo: "+ miArreglo04[2].edad);
console.log("El número de elementos del arreglo 4 es: " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arreglo nuevo: " + nuevoArreglo00.sort());
console.log("Orden de mi arreglo  método pop: " + nuevoArreglo00.pop());
console.log("Orden de mi arreglo  método push: " + nuevoArreglo00.push(10));
console.log("Orden de mi arreglo método reverse: " + nuevoArreglo00.reverse());

console.log("Python"[2]);
console.log("Python".length);

let matriz = [[1,2,3],[4,5,6],[7,8,9]];
console.log("Tamaño " + matriz.length);
console.log(matriz[1][1]);//fila,columna
console.log(matriz[2][1]);
console.log(matriz[0][2]);