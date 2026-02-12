package com.example.aulacomponenteslistagemcolecoes.teste

/*
class Motorista(val nome: String){
    fun exibirDadosMotorista() = println("Motorista: $nome")


/* class Caminhao(val nomeCaminhao: String){ // Classe aninhada(Nested Class), pois tem relacao com a classe motorista
        fun exibirDadosCaminhao() = println("Caminhao")


    }*/


    inner class Caminhao(val nomeCaminhao: String){ // Inner class tem comunicação com a classe motorista
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao, motorista: $nome")


    }


}
*/

//data class Pergunta( var pergunta: String,  var respostaCerta: Int )

// Getter(conseguir, recuperar) e Setter(alterar/Configurar)


class Usuario(){

    var nome: String = ""
        get() {
            println("get: $field")
            return field.uppercase()
        }
        set(value) {
           field = "set: $value"
        }


    var idade: Int = 0
    var maiorIdade = false
        get() = idade >= 18





}



fun main() {

    val usuario = Usuario()
    usuario.nome = "Vinicius"
    usuario.idade = 34

    println("nome: ${usuario.nome}")
    println("idade: ${usuario.idade}")
    println("maiorIdade: ${usuario.maiorIdade}")

}")


  /*  val pessoa = Pessoa()
    pessoa.nome = "Talles"
    pessoa.idade = 33
*/

/*    Desestruturação (Destructuring)
    val (pergunta, resposta) = pergunta1  » seria o mesmo que a seguir:

    val p = pergunta1.pergunta
    val r = pergunta1.respostaCerta



    CODIGO DESESTRUTURADO
    val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 1)

    val (pergunta, resposta) = pergunta1
    println(pergunta)
    println(resposta)


    */

//println(pergunta1 == pergunta2) // Elas vao ser diferentes pq cada um tem uma "identificação."






/*

    val motorista = Motorista("Batata")
    val caminhao = motorista.Caminhao("Carreta Furacão")

    caminhao.exibirDadosCaminhao()



    // Exemplo classe aninhada (NESTED CLASS)
    val caminhao = Motorista.Caminhao("Carreta Furacão")
    caminhao.exibirDadosCaminhao()




    val motorista = Motorista("Batata")
    motorista.exibirDadosMotorista()
*/



}