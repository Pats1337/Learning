object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        log("header1", "", "footer1")
        log("header2", footer = "footer2")
        log("header3", "body3", "footer3")
        print("");
        print("a", "b", "c")
        val myObject = MyObject()
        myObject.add("first string")
        myObject add "second string"
    }

    fun log(header: String, body: String = "", footer: String) {
        if (header.isNotEmpty()) {
            println(header)
        }
        if (body.isNotEmpty()) {
            println(body)
        }
        if (footer.isNotEmpty()) {
            println(footer)
        }
    }

    private fun print(vararg args: String) {
        for (string in args) {
            println(string)
        }
    }

    class MyObject {
        private val list = ArrayList<String>()
        infix fun add(str: String) {
            list.add(str)
        }
    }

}