package com.example.aulacomponenteslistagemcolecoes.teste

class Motorista(val nome: String){
    fun exibirDadosMotorista() = println("Motorista: $nome")

    /* class Caminhao(val nomeCaminhao: String){ // Classe aninhada(Nested Class), pois tem relacao com a classe motorista
        fun exibirDadosCaminhao() = println("Caminhao")


    }*/

    inner class Caminhao(val nomeCaminhao: String){ // Inner class tem comunicação com a classe motorista
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao, motorista: $nome")


    }


}


fun main() {

    val motorista = Motorista("Batata")
    val caminhao = motorista.Caminhao("Carreta Furacão")

    caminhao.exibirDadosCaminhao()




  /*
    // Exemplo classe aninhada (NESTED CLASS)
    val caminhao = Motorista.Caminhao("Carreta Furacão")
    caminhao.exibirDadosCaminhao()*/




   /* val motorista = Motorista("Batata")
    motorista.exibirDadosMotorista()*/



}