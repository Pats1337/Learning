object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val simpleClass = SimpleClass()
        val other = SimpleClass(1)
        val new = SimpleClass("text")
    }
}

class SimpleClass {

    private val data: Int

    constructor (text: String = "") : this(text.length)

    constructor (number: Int) {
        data = number
    }
}
