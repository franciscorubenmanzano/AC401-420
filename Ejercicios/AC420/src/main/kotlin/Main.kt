import kotlin.random.Random

class Dado { // creo la clase Dado
    private var valor: Int = 0 // Inicializamos el valor del dado a 0


    fun tirarDado() {
        valor = Random.nextInt(1, 7) // Genera un número aleatorio entre 1 y 6
    }

    fun imprimirValor() {
        println("El valor del dado es: $valor")
    }
}
fun main() {
    // Definir un array de 5 objetos de tipo Dado
    val dados = Array(5) { Dado() }

    // Tirar los 5 dados e imprimir los valores de cada uno
    for (dado in dados) {
        dado.tirarDado()
        dado.imprimirValor()
    }
}
