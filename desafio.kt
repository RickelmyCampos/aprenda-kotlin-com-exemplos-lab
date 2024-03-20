// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String,val idade:Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)

    }

    fun listarInscritos(): List<Usuario> = inscritos

}

fun main() {
    val listContent = listOf(
        ConteudoEducacional("introducao kotlin", duracao = 120, nivel = Nivel.BASICO),
        ConteudoEducacional("android kotlin", duracao = 120, nivel = Nivel.INTERMEDIARIO)
    )
    val kotlin = Formacao("Kotlin", conteudos = listContent,Nivel.INTERMEDIARIO)

    val gil=Usuario("Gil",20)
    val rick=Usuario("Rick", idade = 26)
    kotlin.matricular(gil,rick)
    print(" lista de inscritos: ${kotlin.listarInscritos()}")
 
}

