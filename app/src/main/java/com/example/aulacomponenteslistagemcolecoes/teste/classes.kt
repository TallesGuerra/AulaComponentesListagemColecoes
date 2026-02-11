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

data class Pergunta( var pergunta: String,  var respostaCerta: Int )



fun main() {
    val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 1)

    println(pergunta1 == pergunta2) // Elas vao ser diferentes pq cada um tem uma "identificação."






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