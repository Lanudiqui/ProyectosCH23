let var1 = parseInt(prompt("Ingrese el primer valor"));
let var2 = parseInt(prompt("Ingrese el segundo valor"));
let var3 = parseInt(prompt("Ingrese el tercer valor"));
let menor, medio, mayor;

if (var1 < var2 && var1 <var3){
    menor = var1;
    if (var2 <= var3){
        medio = var2;
        mayor = var3;
    }else {
        medio = var3;
        mayor = var2;
    }
} else if (var2 < var1 && var2 <var3){
    menor = var2;
    if (var1 <= var3){
        medio = var1;
        mayor = var3;
    } else{
        medio = var3;
        mayor = var1;
    }
}else {
    menor = var3;
    if (var1 <= var2){
        medio = var1;
        mayor = var2;
    }else{
        medio = var2;
        mayor = var1; 
    }
}

document.write("Los valores ordenados de menor a mayor son: ");
document.write(menor + ", " + medio + ", " + mayor);
document.write("<br>");
document.write("<br>");
document.write("Los valores ordenados de mayor a menor son: ");
document.write(mayor + ", " + medio + ", " + menor);


