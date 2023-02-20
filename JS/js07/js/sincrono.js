//javaScript sincrono
alert("cohoerte 23");
console.log("Hola, buen día");
alert("Día del gatito");
console.log("adios");

//Asincrono
setTimeout(

    function(){
        console.log("Hola mundo, con retraso de tiempo");
    },1000
    

    
);
console.log("sorpresa");

const myCollback = () => console.log("Hola mundo con retraso");
setTimeout(myCollback);
console.log("sorpresa");