class Variables {
    val name: String  = "Gean"
    val age: Int      = 25
    val pi: Double    = 3.14
    val nullable: String? = null

    val i: Int     = 10
    val d: Double  = 3.14
    val f: Float   = 3.14f
    val l: Long    = 100L
    val b: Boolean = true
    val c: Char    = 'A'
    val s: String  = "Gean"
}

class StringTemplates {
    val name = "Gean"

    fun run() {
        println("Hello, $name")
        println("2 + 2 = ${2 + 2}")
    }
}

class Functions {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sumExpression(a: Int, b: Int) = a + b

    fun greet(name: String = "world") = "Hello, $name!"

    fun log(msg: String): Unit = println(msg)
}

class Conditionals {
    val x: Int = 7

    val result = if (x > 0) "positive" else "negative"

    val label = when (x) {
        1    -> "one"
        else -> "other"
    }

    fun evaluate() {
        when (x) {
            1    -> println("one")
            2, 3 -> println("two or three")
            in 4..10 -> println("between 4 and 10")
            else -> println("other")
        }
    }
}

fun main() {
    val vars   = Variables()
    val tmpl   = StringTemplates()
    val fn     = Functions()
    val cond   = Conditionals()

    tmpl.run()

    println(fn.greet())
    println(fn.greet("Gean"))
    println(fn.sum(3, 4))
    fn.log("log message")

    println(cond.result)
    println(cond.label)
    cond.evaluate()
}