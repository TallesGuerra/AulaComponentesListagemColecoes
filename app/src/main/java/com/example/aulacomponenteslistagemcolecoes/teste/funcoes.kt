package com.example.aulacomponenteslistagemcolecoes.teste

class Matematica {
    fun somar(
        n1: Int,
        n2: Int
    ): Int {  //MetoDo » Criando a fun detntro da classe ela precisa ser instanciada
        return n1 + n2
    }


}

// FUNÇÃO » Crianddo a funçao fora da classe pode ser chamada em qualquer lugar sem instanciar
fun somar(n1: Int, n2: Int): Int {

    return n1 + n2
}

fun calcular(funcao: (Int, Int) -> Int) {

    val retorno = funcao(10, 10)
    println("O retorno é $retorno")

}

/*class Botao {
    fun configCliqueBotao(
        nome: String,
        funcao: () -> Unit  // no caso do paramentro, é preciso definir o UNIT quando a função não tera retorno.
    ) {
        funcao()
        println("Meu nome é $nome")
    }
}*/

class Botao {
    fun configCliqueBotao(funcao: (String) -> Unit ) {
        funcao("Talles")

    }
}


fun main() {
    val botao = Botao()
    botao.configCliqueBotao { nome ->
        println("Executou clique do botão, função lambda executou nome: $nome")
    }


    // Funcao Lambda

    /*val funcaoLambda = {nome: String, Idade: Int ->
        println("Meu nome é $nome e minha idade é $Idade")
    }

    funcaoLambda("Talle", 33)*/
    //calcular(::somar)

    /* val matematica = Matematica()
     val retorno = matematica.somar(10, 10)*/ // utilizando a fun q veido da class Matematica
    //val retorno = somar(10, 10) // utilizando a fun somar fora da classe
    //println("O retorno é $retorno")

}