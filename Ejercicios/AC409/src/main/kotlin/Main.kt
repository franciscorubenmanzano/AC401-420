fun main() {
    println("Ingrese la longitud del array:")
    val longitud = excepcionEntero()
    val array = crearycargararray(longitud)

    println("Los elementos del array son:")
    for (elemento in array) {
        print("$elemento ")
    }

    val suma = sumadeelementos(array)
    println("\nLa suma de los elementos del array es: $suma")

    burbuja(array) // Ordena directamente el array

    // Imprimir el array ordenado
    println("\nArray ordenado:")
    for (elemento in array) {
        print("$elemento ")
    }

    // Imprimir la posición y valor del mayor y menor valor después de ordenar
    imprimirMayorMenor(array)
}

fun crearycargararray(longitud: Int): IntArray {
    val array = IntArray(longitud)
    println("Ingrese los elementos del array:")
    for (i in 0..<longitud) {
        print("Elemento ${i + 1}: ")
        array[i] = excepcionEntero()
    }
    return array
}

fun sumadeelementos(array: IntArray): Int {
    var suma = 0
    for (elemento in array) {
        suma += elemento
    }
    return suma
}

fun excepcionEntero(): Int {
    while (true) {
        try {
            return readln().toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}

fun burbuja(array: IntArray) { // Ordena el array de menor a mayor
    var aux: Int //variable auxiliar
    val n = array.size //tamaño del array
    for (i in 0..<n - 1) { //bucle para recorrer el array
        for (j in 0..<n - i - 1) { // segundo bucle para comparar los elementos del array
            // Si el elemento actual es mayor que el siguiente
            if (array[j] > array[j + 1]) { //intercambia los elementos
                aux = array[j] //guarda el elemento actual en la variable auxiliar
                array[j] = array[j + 1] //guarda el elemento siguiente en el elemento actual
                array[j + 1] = aux //guarda el elemento actual en el elemento siguiente
            }
        }
    }
}

fun imprimirMayorMenor(array: IntArray) {
    val n = array.size
    println("\nEl mayor valor es ${array[n - 1]} en la posición ${n - 1}")
    println("El menor valor es ${array[0]} en la posición 0")
}
