var Tarjeta = new Object()
Tarjeta.marca = 'nvidia';
Tarjeta.modelo = 'GTX 1050';
Tarjeta.precio = 200;

var Tarjeta = new Object()
var Tarjeta = {
    marca: 'nvidia',
    modelo: 'GTX 1050',
    precio: 200
};

var suma = Tarjeta.precio + 5;

function operaciones(suma){
    var r = suma;
    console.log(r);
}
operaciones(suma);


function mensaje(){
    var msg = "La cantidad es: ";
    console.log(msg);
}

var Metodo = new Object()
Metodo.dia = 'lunes'
Metodo.mensaje = mensaje;


function final (){
    function mensaje(){
        var msg = "La cantidad es: ";
        console.log(msg);
    }
    mensaje();
}
final();


//PROTOTYPE

var suma = 4 + 5;
function operaciones(){
    operaciones.prototype.suma;
    var r = suma;
    console.log(r);
}
operaciones();