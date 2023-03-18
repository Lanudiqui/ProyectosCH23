
    let temp = parseFloat(prompt("Ingrese la temperatura en grados centigrados"))
      
    if (Number.isNaN(temp)===true) {
        document.write("Ingrese un valor numerico")
        
    } else  {
        let k = parseFloat(temp +273.15);
        let f = parseFloat((temp*1.8)+32);
        document.write("Grados Kelvin: " + k);
        document.write("<br>")
        document.write("Grados Fahrenheit: " + f);
    }
