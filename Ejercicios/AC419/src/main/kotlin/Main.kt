data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

// Definir un array de 4 elementos de tipo Articulo
val articulos = arrayOf(
    Articulo(1, "VideoConsola", 500.0f),
    Articulo(2, "Television", 1000.0f),
    Articulo(3, "Mando", 50.0f),
    Articulo(4, "Videojuego", 60.0f)
)

fun aumentar10PorCiento() {
    articulos.forEach { it.precio *= 1.1f }
}

fun mostrarArticulos() {
    articulos.forEach { println(it) }
}

fun main() {
    println("Articulos:")
    mostrarArticulos()

    println("\nArticulos con aumento del 10%:")
    aumentar10PorCiento()
    mostrarArticulos()
}
