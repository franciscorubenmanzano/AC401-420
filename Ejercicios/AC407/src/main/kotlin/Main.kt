fun main() {
    val arrayEnteros = IntArray(8) //crea un array de 8 elementos

    println("Ingresa los 8 elementos enteros:")

    for (i in 0..<8) { //pide los 8 elementos enteros
        print("Elemento ${i + 1}: ") //muestra el numero de elemento que se esta ingresando
        arrayEnteros[i] = excepcionEntero() //llama a la funcion excepcionEntero() para controlar la excepcion
    }


    println("Los elementos ingresados son:")
    for (elemento in arrayEnteros) { //bucle para mostrar los elementos del array
        print("$elemento ")
    }

    val sumatotal = arrayEnteros.sum() //suma los elementos del array
    println("\nLa suma de los elementos ingresados es: $sumatotal")


    val suma = arrayEnteros.filter { it > 36 }.sum() //suma los elementos mayores a 36
    println("\nLa suma de los elementos mayores a 36 es: $suma")


    val mayorde50 = arrayEnteros.count { it > 50 } //cuenta los elementos mayores a 50 dentro del array
    println("La cantidad de valores mayores a 50 es: $mayorde50")
}


fun excepcionEntero(): Int { //funcion para controlar la excepcion
    while (true) {
        try {
            return readln().toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}
