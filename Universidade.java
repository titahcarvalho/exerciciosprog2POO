package exercicios_progr2;
import java.util.Random;

public class Universidade {
	String nome, endereco, telefone, titulo, area;
	int  duracao, cargaHoraria;
		public Universidade () {
		}
		
	public void funcionario() {
		Random gerarctps = new Random();
		int ctps = gerarctps.nextInt(2000);
		System.out.println("CTPS: " + ctps);
		
		Random gerar = new Random();
		float salario = gerar.nextInt(2000);
		System.out.println("Salário: R$ " + salario);
		int cpf = gerar.nextInt(3000);
		System.out.println("CPF: " + cpf);
	}
	public void aluno() {
				
	}
	public void curso() {
		Random gerador = new Random();
		int codigo = gerador.nextInt(1000);
		System.out.println("Código do curso:" + codigo );
		System.out.println("Duração:" + duracao + " anos.");
				
	}
	public void professor() {
		Random gerar = new Random();
		float salario = gerar.nextInt(2000);
		System.out.println("Salário: R$ " + salario);
		int cpf = gerar.nextInt(3000);
		System.out.println("CPF: "  + cpf);
		
	}
	public void disciplina() {
		Random gerador = new Random();
		int codigo = gerador.nextInt(1000);
		System.out.println("Código da Disciplina: " + codigo );
		System.out.println("Carga Horária: " + cargaHoraria + " horas.");
				
	}
	
	
}
