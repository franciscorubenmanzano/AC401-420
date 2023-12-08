fun main(args: Array<String>) {

    val enteros= IntArray(3) //  declaro un array de 3 posiciones para las nbotas


    println("Ingrese 3 numeros enteros") //pido los numeros
    for (i in 0 .. enteros.size-1) {  //recorro el array size-1 para que no se salga del array
        println("Ingrese el ${i + 1}º numero:")  //pido el numero
        enteros[i] = excepcion_entero()  //controlo la excepcion con la funcion excepcion_entero()
    }

    val promedio = enteros.average() //calculo el promedio
    val cuadrado = enteros.map { it * it } //calculo el cuadrado de los numeros
    val binario =enteros.map { Integer.toBinaryString(it) } //calculo el numero en binario

    println("El promedio es: $promedio")
    println("El cuadrado de los numeros es: $cuadrado")
    println("El numero en binario es: $binario")


    }

fun excepcion_entero(): Int { //funcion para controla la excepcion
    while (true) {
        try {
            return readLine()!!.toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}
