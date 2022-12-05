enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class CargaHorario {
    BASICO: (Int = 60),
    INTERMEDIARIO: (Int = 100),
    AVANCADO: (Int = 240);
}

class Usuario (
    Nome: String,
    Matricula: String,
    Nivel: String,
    Curso: String;
)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)
    Matematica: Int,
    Portugues: Int,
    Geografia: Int,


data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {

}

fun main() {
    
    class <Usuario>(
        Nome: "Paulo",
        Matricula: "aerd",
        Nivel: BASICO,
        Curso: Matematica,
    )
   

}
