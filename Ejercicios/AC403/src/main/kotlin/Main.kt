fun retornarSuperficie(lado1: Int, lado2: Int): Int { //funcion para calcular la superficie
    return lado1 * lado2
}

fun main() {
    //pido los datos de los rectangulos y utilizo (excepcion_entero())
    // para que no se cierre el programa si se ingresa un valor distinto a un número

    println("Ingrese los lados del primer rectángulo:")
    val lado1Rectangulo1 = (excepcion_entero())
    val lado2Rectangulo1 = (excepcion_entero())

    println("Ingrese los lados del segundo rectángulo:")
    val lado1Rectangulo2 = (excepcion_entero())
    val lado2Rectangulo2 = (excepcion_entero())

    //calculo la superficie y el perimetro de los rectangulos

    val superficieRectangulo1 = retornarSuperficie(lado1Rectangulo1, lado2Rectangulo1)
    val superficieRectangulo2 = retornarSuperficie(lado1Rectangulo2, lado2Rectangulo2)
    val perimetroRectangulo1 = 2 * (lado1Rectangulo1 + lado2Rectangulo1)
    val perimetroRectangulo2 = 2 * (lado1Rectangulo2 + lado2Rectangulo2)

    //imprimo los resultados
    println("Superficie del primer rectángulo: $superficieRectangulo1")
    println("Perímetro del primer rectángulo: $perimetroRectangulo1")
    println("Superficie del segundo rectángulo: $superficieRectangulo2")
    println("Perímetro del segundo rectángulo: $perimetroRectangulo2")

    //comparo las superficies de los rectangulos
    if (superficieRectangulo1 > superficieRectangulo2) { // si la superficie del rectangulo 1 es mayor imprimo que el rectangulo 1 es mayor
        println("El primer rectángulo tiene una superficie mayor.")
    } else if (superficieRectangulo1 < superficieRectangulo2) { // si la superficie del rectangulo 2 es mayor imprimo que el rectangulo 2 es mayor
        println("El segundo rectángulo tiene una superficie mayor.")
    } else { // si las superficies son iguales imprimo que son iguales
        println("Ambos rectángulos tienen la misma superficie.")
    }
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
