package exercicios_progr2;
import java.util.Random;
public class Cursos {

		String nome;
		int codigo;
		int duracao; //semestres
		Disciplinas disciplina;

		public Cursos (String nome, int codigo, int duracao) {
			Random gerar = new Random();
			this.nome = nome;
			this.codigo = gerar.nextInt(200);
			this.duracao = duracao;
	}
		
}
