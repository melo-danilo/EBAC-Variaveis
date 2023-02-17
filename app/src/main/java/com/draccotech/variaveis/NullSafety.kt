package com.draccotech.variaveis

class NullSafety {
}

fun main() {
    var texto: String? = "meu texto"
    var tamanho: Int? = texto?.length
}