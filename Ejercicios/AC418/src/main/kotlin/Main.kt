abstract class Cuenta {
    var Titular: String = ""
    var monto: Double = 0.0

    fun imprimir() {
        println("Titular: $Titular")
        println("Monto: $monto")
    }

    fun ingresar(monto: Double) {
        if (monto > 0) {
            this.monto += monto
        }
    }

    fun retirar(monto: Double) {
        if (this.monto - monto >= 0) {
            this.monto -= monto
        }
    }
}

class CajaDeAhorro : Cuenta() {
    var interes: Double = 0.0
    set(value) {
        field = 0.0
    }

}

class PlazoFijo : Cuenta() {
    var plazo: Int = 0
    var interes: Double = 0.0
}

fun main() {

    //crear un objeto de la clase CajaDeAhorro
    val cajaDeAhorro1 = CajaDeAhorro()
    cajaDeAhorro1.Titular = "Sergio"
    cajaDeAhorro1.monto = 1000.0
    cajaDeAhorro1.interes = 1.5
    cajaDeAhorro1.imprimir()

    val plazoFijo1 = PlazoFijo()
    plazoFijo1.Titular = "Pablo"
    plazoFijo1.monto = 1000.0
    plazoFijo1.interes = 2.5
    plazoFijo1.plazo = 30
    plazoFijo1.imprimir()

}
