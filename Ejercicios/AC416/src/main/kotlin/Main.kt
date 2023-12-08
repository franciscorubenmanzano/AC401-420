class Dado {
    var valor: Int = 0
        set(value) {
            // Debe ser comprendido entre 1 y 6
            field = if (value in 1..6) value else 1
        }
}

fun imprimirDado(dado: Dado) {
    println(dado.valor)
}

fun generarAleatorio(): Int {
    return (1..6).random()
}

fun main() {
    val dado1 = Dado()
    dado1.valor = 7
    imprimirDado(dado1)
}
