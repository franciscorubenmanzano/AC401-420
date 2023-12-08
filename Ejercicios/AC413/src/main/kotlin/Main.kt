class Socio {
    // Atributos
    var nombre: String = ""
    var antiguedad: Int = 0

    // Constructor
    fun inicializar(nombre: String, antiguedad: Int) {
        this.nombre = nombre
        this.antiguedad = antiguedad
    }

    // Función para imprimir los datos del socio
    fun imprimir() {
        println("El Socio $nombre tiene una antigüedad de $antiguedad años")
    }

    fun imprimirmayor() {
        println("El socio con mayor antigüedad es $nombre ")
    }
}

class Club(
    // Constructor
    // Atributos que son 3 objetos de la clase Socio
    var socio1: Socio, var socio2: Socio, var socio3: Socio
) {
    // Función para imprimir el socio con mayor antigüedad
    fun SocioConMayorAntiguedad() {
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad) {
            socio1.imprimirmayor()
        } else if (socio2.antiguedad > socio3.antiguedad) {
            socio2.imprimirmayor()
        } else {
            socio3.imprimirmayor()
        }
    }
}

fun main() {
    // Crear objetos de la clase Socio
    val socio1 = Socio()
    socio1.inicializar("Sergio", 5)
    socio1.imprimir()

    val socio2 = Socio()
    socio2.inicializar("Pablo", 2)
    socio2.imprimir()

    val socio3 = Socio()
    socio3.inicializar("Juan", 8)
    socio3.imprimir()

    // Crear objeto de la clase Club
    val club = Club(socio1, socio2, socio3)

    // Imprimir el socio con mayor antigüedad en el club
    club.SocioConMayorAntiguedad()
}
