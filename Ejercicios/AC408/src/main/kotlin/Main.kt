fun main() {

    val array1 = IntArray(4) // primer array de 4 elementos
    val array2 = IntArray(4) // segundo array de 4 elementos

    // Pedir la carga del primer array
    println("Inserte los enteros del primer array:")
    for (i in 0 until 4) { // bucle para pedir los 4 elementos del primer array
        print("Entero ${i + 1}: ") // imprime el numero de elemento que se esta ingresando
        array1[i] = excepcionEntero()
    }

    // Pedir la carga del segundo array
    println("Inserte los enteros del segundo array:")
    for (i in 0 until 4) { // bucle para pedir los 4 elementos del segundo array
        print("Entero ${i + 1}: ") // imprime el numero de elemento que se esta ingresando
        array2[i] = excepcionEntero()
    }

    // Imprimir los elementos del primer array
    println("Enteros del primer array:")
    for (entero in array1) {
        print("$entero ")
    }

    // Imprimir los elementos del segundo array
    println("\nEnteros del segundo array:")
    for (entero in array2) {
        print("$entero ")
    }

    // Calcular y mostrar la suma de los arrays
    val arraySuma = sumadeArrays(array1, array2)
    println("\nSuma de los arrays:")
    for (entero in arraySuma) {
        print("$entero ")
    }
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

fun sumadeArrays(array1: IntArray, array2: IntArray): IntArray {
    val array3 = IntArray(4) // array para guardar la suma de los elementos de los dos arrays
    for (i in 0 until 4) {
        array3[i] = array1[i] + array2[i] // suma los elementos de los dos arrays y los guarda en el arraySuma
    }
    return array3
}
