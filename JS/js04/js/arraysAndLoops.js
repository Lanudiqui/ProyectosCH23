/*Part 1
There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan.
 Create an array that has these three names in order */
let names = ["Sofia","David","Juan"];
console.log(names);
/*Part 2
Two more people get added to the back of the line - Sara and Augustin. 
The first person in line is called to the teller. What does the queue look like?*/
names.push("Sara",);
names.push("Agustin",);
console.log("Ingresan las dos nuevas érsonas" + names);
/*Part 3
It turns out David was saving a spot for his friend Renata.
 She shows up and goes behind him in the line. One more person (Elena) shows up and goes to the end of the line. 
 What does the queue look like? */
names.splice(0,1);
console.log("La nueva cola de la fila queda así: " + names);
names.splice(1,0,"Renata")
names.push("Elena");
console.log("La ultima fila queda así: " + names)

/*Exercise #2
Write a JavaScript program to construct the following pattern, using a nested for loop.*/

let a = "*";
let contador = 0;

while(contador <5){
    console.log(a);
    a +=  "*";
    contador+=1 ;
} 

/*Exercise #3
Write while loops to do the following: */

//– Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time, as long as xValue remains positive.
var xValue = parseFloat(prompt("Ingrese un número positivo: "));
console.log(xValue);
while(xValue==0.0){
    xValue = xValue - 0.5;
    console.log(xValue);
}
console.log(xValue);
console.log("****************************************");

//Print all the odd numbers between 1 - 100.
let numero = 0;
while(numero <=100){
    console.log("Número par: " + numero);
    numero+=2;

}

//- Write a method with a while loop that computes the sum of first n positive integers:

let n = 1
while(n===10){
    n++
    sum = sum + n  
    console.log(sum)
}