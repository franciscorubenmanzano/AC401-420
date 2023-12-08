fun main() {
    println("Ingrese un número:") //pido el numero
    val numero = excepcion_entero() //controlo la excepcion con la funcion excepcion_entero()

    tablaMultiplicar(numero) //llamo a la funcion tablaMultiplicar() y le paso el numero ingresado

}

fun tablaMultiplicar(valor: Int, termino: Int = 10) { //funcion para mostrar la tabla de multiplicar
    for (i in 1..termino) {
        val resultado = valor * i
        println("$valor x $i = $resultado")
    }
}

fun excepcion_entero(): Int {
    while (true) {
        try {
            return readLine()!!.toInt()
        } catch (e: Exception) {
            println("Ingrese un número válido")
        }
    }
}