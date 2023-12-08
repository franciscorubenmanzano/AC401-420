data class Dado(var valor: Int = 0) { //clase Dado
    override fun toString(): String {  //sobreescribo la funcion toString()
        return "*".repeat(valor) //para que imprima el valor del dado en forma de asteriscos
    }
}

fun generarAleatorio(): Int { //funcion para generar un numero aleatorio entre 1 y 6
    return (1..6).random()
}

fun generarUnDado(): Dado { //funcion para generar un dado
    val valorDado = generarAleatorio()
    return Dado(valorDado)
}

fun generarVariosDados(cantidad: Int): Array<Dado> { //funcion para generar varios dados
    return Array(cantidad) { generarUnDado() }
}

fun main() {

   // Menu
    var opcion: Int

    do {
        println("Menú:")
        println("1.- Generar un dado")
        println("2.- Generar más de un dado")
        println("3.- Salir")

        print("Ingrese el número de la opción deseada (3 para salir): ")

        opcion = excepcionEntero()

        when (opcion) {
            1 -> {
                val dado = generarUnDado()
                println("Ha generado un dado con valor: $dado")
            }
            2 -> {
                print("No he sabido hacerlo ")

            }
        }
    } while (opcion != 3)
}


fun excepcionEntero(): Int { //funcion para controlar excepciones
    while (true) {
        try {
            return readlnOrNull()?.toInt() ?: -1
        } catch (e: NumberFormatException) {
            println("Ingrese un número válido")
        }
    }
}
