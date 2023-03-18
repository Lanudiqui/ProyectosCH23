function fibonacci(n) {
    // Verificar si el número es menor o igual a 0
    if (n <= 0) {
      document.write("Por favor, introduce un número mayor que 0");
    }
    // Generar los primeros dos números de Fibonacci
    else if (n === 1) {
      return 0;
    }
    else if (n === 2) {
      return 1;
    }
    // Generar los siguientes números de Fibonacci
    else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  
  // Pedir al usuario cuántos números de Fibonacci quiere generar
  var cantidad = parseInt(prompt("¿Cuántos números de Fibonacci quieres generar?"));
  
  // Generar los números de Fibonacci solicitados
  console.log("Los primeros " + cantidad + " números de Fibonacci son:");
  for (var i = 1; i <= cantidad; i++) {
    document.write(fibonacci(i));
  }
  