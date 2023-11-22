package exercicios_progr2;
//import java.util.Random;
public class Cursos {

	private	String nome;
	private int codigo;
	private int duracao; //semestres
	private Disciplinas disciplina;

		public Cursos (String nome, int codigo, int duracao) {
			//Random gerar = new Random();
			this.nome = nome;
			this.codigo = codigo;
			this.duracao = duracao;
	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getDuracao() {
			return duracao;
		}

		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		public Disciplinas getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplinas disciplina) {
			this.disciplina = disciplina;
		}
		
}
