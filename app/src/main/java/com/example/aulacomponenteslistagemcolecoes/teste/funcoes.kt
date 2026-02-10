package com.example.aulacomponenteslistagemcolecoes.teste

class Matematica {
    fun somar(n1: Int, n2: Int): Int { /* MetoDo » Criando a fun detntro da classe ela precisa ser instanciada*/
        return n1 + n2
    }
}

// FUNÇÃO » Crianddo a funçao fora da classe pode ser chamada em qualquer lugar sem instanciar
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}


fun main() {
   /* val matematica = Matematica()
    val retorno = matematica.somar(10, 10)*/ // utilizando a fun q veido da class Matematica

    val retorno = somar(10, 10) // utilizando a fun somar fora da classe

    println("O retorno é $retorno")

}