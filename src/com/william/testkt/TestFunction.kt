package com.william.testkt

class TestFunction {


}

fun main() {
    foo(1) { println("hello1") } // 使用默认值 baz = 1
    foo(qux = { println("hello2") }) // 使用两个默认值 bar = 0 与 baz = 1
    foo { println("hello3") }        //


    reformat("a")
    reformat("a", true, true, false, '_')

    // 具名参数
    reformat(str = "a",
            normalizeCase = true,
            upperCaseFirstLetter = true,
            divideByCamelHumps = false,
            wordSeparator = '_'
    )
    reformat(normalizeCase = false)

    // 可变数量参数
    foo(strings = *arrayOf("a", "b", "c"))


}

fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
/*……*/
}

fun reformat(str: String = "11",
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
    /*……*/
}

fun foo(vararg strings: String) { /*……*/
}

