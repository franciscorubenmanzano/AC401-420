class Hijos {
    private val edades: IntArray = IntArray(5)

    fun cargar() {
        println("Ingrese las edades de 5 personas:")
        almacenar_edades()
        println("Edades ingresadas:")
        cargar_edades()
        println("Mayor edad: ${mayor_edad()}")
        println("Promedio de edades: ${promedio_edades()}")
    }

    private fun almacenar_edades() {
        for (i in 0 until 5) {
            print("Edad ${i + 1}: ")
            edades[i] = excepcionEntero()
        }
    }

    private fun cargar_edades() {
        for (edad in edades) {
            print("$edad ")
        }
        println()  // Agregar un salto de línea al final
    }

    private fun promedio_edades(): Double {
        var suma = 0
        for (edad in edades) {
            suma += edad
        }
        return suma / 5.0
    }

    private fun mayor_edad(): Int {
        var mayor = edades[0]
        for (edad in edades) {
            if (edad > mayor) {
                mayor = edad
            }
        }
        return mayor
    }
}

fun main() {
    val hijos = Hijos()
    hijos.cargar()
}

fun excepcionEntero(): Int {
    while (true) {
        try {
            return readLine()!!.toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}
