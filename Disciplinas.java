package exercicios_progr2;

public class Disciplinas {

	public static void main(String[] args) {
		Universidade prog2  = new Universidade();
		prog2.nome = "Programação de computadores II";
		prog2.cargaHoraria = 60;
		System.out.println("Nome: " + prog2.nome);
		prog2.disciplina();
		
		System.out.println("____________________________");

		Universidade estatistica  = new Universidade();
		estatistica.nome = "Estatistica e Probabilidade";
		estatistica.cargaHoraria = 60;
		System.out.println("Nome: " + estatistica.nome);
		estatistica.disciplina();
		
		System.out.println("____________________________");
		
		Universidade oac  = new Universidade();
		oac.nome = "Organização e Arquitetura de Computadores";
		oac.cargaHoraria = 60;
		System.out.println("Nome: " + oac.nome);
		oac.disciplina();
		
		System.out.println("____________________________");
	}

}
