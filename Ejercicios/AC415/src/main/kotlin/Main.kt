

fun main() {
    // Creo dos empleados, los inicializo y los imprimo

    // Primer empleado
    val empleado1 = Empleado()
    empleado1.inicializar("PEPE", 999.0)
    empleado1.imprimir()

    // Segundo empleado
    val empleado2 = Empleado()
    empleado2.inicializar("PACO", -500.0) // Intentando asignar un sueldo negativo
    empleado2.imprimir()

    // Imprimo el empleado con mayor sueldo
    println("El empleado con mayor sueldo es: ${mayorSueldo(empleado1, empleado2).nombre}")
}

class Empleado {
    // Atributos
    var nombre: String = ""
        private set // Hace que el set sea privado para evitar modificaciones externas
    var sueldo: Double = 0.0

        private set(valor) {
            // Verifica que el valor no sea negativo antes de asignarlo
            field = if (valor >= 0) valor else 0.0
        }

    // Constructor
    fun inicializar(nombre: String, sueldo: Double) {
        this.nombre = nombre
        this.sueldo = sueldo
    }

    // Función para imprimir los datos del empleado
    fun imprimir() {
        println("Nombre: $nombre y su sueldo es de $sueldo")
    }
}

// Función para devolver el empleado con mayor sueldo
fun mayorSueldo(empleado1: Empleado, empleado2: Empleado): Empleado {
    // Función para devolver el empleado con mayor sueldo
    return if (empleado1.sueldo > empleado2.sueldo) empleado1 else empleado2
}
