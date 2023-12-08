fun main() {
    val notas = IntArray(3) // Declaro un array de 3 posiciones

    println("Ingrese 3 notas")

    notas.indices.forEachIndexed { index, _ ->
        println("Ingrese la ${index + 1}ª nota:")
        notas[index] = excepcion_double().toInt()
    }

    val promedio = notas.average()

    if (promedio >= 7) {
        println("Promocionado")
    }
}

fun excepcion_double(): Double {
    while (true) {
        try {
            return readLine()!!.toDouble()
        } catch (e: NumberFormatException) {
            println("Ingrese un número válido")
        }
    }
}
