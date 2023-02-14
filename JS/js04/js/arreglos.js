let lista = [12,5,80,34];
console.log(lista.length)

for(let i =0; i<lista.length; i++){
    console.log("-->"+lista[i]);
}
console.log(lista)

//Método slice

let listaNueva = lista.slice(1,4);
console.log(listaNueva);

//Método join

let msj = lista.join("-");
console.log(msj)

//Método push
lista.push(100);
console.log(lista);

//Método concat agrega más de un elemento a la lista

let mse = lista.concat(100,200,300);
console.log(mse);

//Método pop elimina el ultimo elmento del arreglo
lista.pop();
console.log(lista);

//Método shift eliminina le primer elemento del arreglo

lista.shift();
console.log(lista);

//Método splice (indice del elememnnto a remover, cuantos lementos queremos remover, se indica si se agrega un nuevo elemento)

//Método sort
lista.sort(
    function(valor1,valor2){
        return valor1 > valor2;
    }
)