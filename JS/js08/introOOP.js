let person = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto: function(){
        return 'El nombre es ' + this.nombre + ' ' + this.person;
    }
}

console.log(person);
console.log(person.nombre)
console.log(person.nombreCompleto())