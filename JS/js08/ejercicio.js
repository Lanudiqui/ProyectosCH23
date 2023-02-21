alert("********Adivine el número del 1 al 100*******");
function adivinar(){
    while(numero >= 1 && numero <=100){
        numero = parseInt(prompt("Ingrese un numero del 1 al 100"));
        numeroAdivinar = Math.floor(Math.random()*100) + 1;
        if(numero === numeroAdivinar){
            alert("Felicidades")
        }

    }
}



