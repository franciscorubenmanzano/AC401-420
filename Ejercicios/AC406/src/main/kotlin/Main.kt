fun main() {
    for (i in 1..5) { // Repite 5 veces

        // Solicita dos números enteros
        println("Ingrese el primer número entero:")
        val entero1 = excepcionEntero()
        println("Ingrese el segundo número entero:")
        val entero2 = excepcionEntero()

        // Llama a la función obtenerMayor() y muestra el resultado
        val mayor = obtenerMayor(entero1, entero2)
        println("El mayor de los dos números es: $mayor")
    }
}

fun excepcionEntero(): Int { // Función para solicitar un número entero que controla la excepción
    while (true) {
        try {
            return readln().toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}

fun obtenerMayor(numero1: Int, numero2: Int): Int {
    // Retorna el mayor de dos números enteros
    return if (numero1 > numero2) { // Si numero1 es mayor que numero2
        numero1 // Retorna numero1

    } else if (numero2 > numero1) { // Si numero2 es mayor que numero1
        numero2 // Retorna numero2

    } else { // Si numero1 y numero2 son iguales
        numero1 // Retorna numero1 (o numero2, es lo mismo)


    }
}
