class Alumno {
    var nombre: String = ""
    var nota: Double = 0.0

    fun inicializar(nombre: String, nota: Double) {
        this.nombre = nombre
        this.nota = nota
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun regular(): Boolean {
        return nota >= 4
    }
}

fun main() {
    val alumno1: Alumno = Alumno()
    alumno1.inicializar("Sergio", 5.0)
    alumno1.imprimir()
    if (alumno1.regular()) {
        println("El alumno está regular")
    } else {
        println("El alumno no está regular")
    }

    val alumno2 = Alumno()
    alumno2.inicializar("Pablo", 2.5)
    alumno2.imprimir()
    if (alumno2.regular()) {
        println("El alumno está regular")
    } else {
        println("El alumno no está regular")
    }
}
