//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val nome = "Gean"
    val idade = 25
    val pi: Double = 3.14
    val x: String? = null

    val i: Int = 10
    val d: Double = 3.14
    val f: Float = 3.14f
    val l: Long = 100L
    val b: Boolean = true
    val c: Char = 'A'
    val s: String = "Gean"

    val name = "Gean"
    println("Olá, $name")
    println("2 + 2 = ${2 + 2}")

    fun soma(a: Int, b: Int): Int {
        return a + b
    }

    fun soma2(a: Int, b: Int) = a + b

    fun greet(name: String = "mundo") = "Olá, $name!"

    fun log(msg: String): Unit = println(msg)

}