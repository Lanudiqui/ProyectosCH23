class Persona {

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    toString(){
        return this.nombreCompleto();
    }

}

class Empleado extends Persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido);
        this._departamento = departamento;
    }

    set departamento(departamento) {
        this._departamento = departamento;
    }
    get departamento() {
        return this._departamento;
    }

    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ',' + this._departamento;
    }

   

    
}

let persona = new Persona('Mauricio', 'Chavez');
//console.log(persona.nombreCompleto());
console.log(persona.toString());

let empleado = new Empleado('Maria', 'Perez', 'Sistemas');
console.log(empleado);
console.log(empleado.nombreCompleto());
console.log(empleado.toString());
/*
let persona1 = new Persona('Alejandro','Morales');
console.log(persona1.nombre);
console.log(persona1.apellido);
console.log(persona1);

let persona2 = new Persona('Maria','Jimenez');
console.log(persona2);

let persona3 = new Persona('Juan','Perez');

persona3.nombre = 'Claus';
console.log(persona3.nombre);

persona3.apellido = 'Siebe';
console.log(persona3.apellido);
*/