package com.example.aulacomponenteslistagemcolecoes.teste

class Mensagem(
    val mensagem: String,
    val duracao: Int
){

    companion object{
        const val DURACAO_CURTA = 1000
        const val DURACAO_LONGA = 2000

        fun construirTexto(mensagem: String, duracao: Int) : Mensagem{
            return Mensagem( mensagem, duracao )

        } // fim construirTexto

    } // fim companio object

    fun exibir(){
        println("Msg: ${this.mensagem} - Duração: ${this.duracao}")
    }

} // fim classe Mensagem


fun main() {
    Mensagem.construirTexto(
        "Olá Mundo",
        Mensagem.DURACAO_LONGA
    ).exibir()

}