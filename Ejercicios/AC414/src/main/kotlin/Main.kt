fun main() {
    val ejemplo = ClasePrivada() //creo un objeto de la clase ClasePrivada

    ejemplo.mostrarElArray() //llamo a la funcion mostrarElArray()

    val mayor = ejemplo.obtenerMayorValor()  //llamo a la funcion obtenerMayorValor()
    println("El mayor valor del arreglo es: $mayor")

    val menor = ejemplo.obtenerMenorValor() //llamo a la funcion obtenerMenorValor()
    println("El menor valor del arreglo es: $menor")
}



class ClasePrivada {

    private val elArray: IntArray = IntArray(5) // Array de 5 elementos de tipo entero

    init { // bloque de inicialización que se utiliza en una clase para ejecutar código
        cargarValoresAleatorios()  //llamo a la funcion cargarValoresAleatorios()
    }

    private fun cargarValoresAleatorios() { //funcion  PRIVADA para cargar valores aleatorios en el array
        for (i in elArray.indices) {  //elArray.indices devuelve un rango de índices
            elArray[i] = (0..10).random() // Rango de valores aleatorios entre 0 y 10
        }
    }

    fun mostrarElArray() {
        println("Arreglo: ${elArray.contentToString()}") // contentToString() devuelve una representación de cadena del array
    }

    fun obtenerMayorValor(): Int {
        return elArray.max() // max() devuelve el valor máximo del array
    }

    fun obtenerMenorValor(): Int {
        return elArray.min() // min() devuelve el valor mínimo del array
    }
}

