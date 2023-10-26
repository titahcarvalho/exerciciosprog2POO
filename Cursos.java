package exercicios_progr2;

public class Cursos {

	public static void main(String[] args) {
		Universidade si  = new Universidade();
		si.nome = "Sistemas de Informação";
		si.duracao = 4;
		System.out.println("Nome: " + si.nome);
		si.curso();
		
		System.out.println("____________________________");
		Universidade ec  = new Universidade();
		ec.nome = "Engenharia de Computação";
		ec.duracao = 5;
		System.out.println("\nNome: " + ec.nome);
		ec.curso();
		
		System.out.println("____________________________");
		Universidade ee  = new Universidade();
		ee.nome = "Engenharia Elétrica";
		ee.duracao = 5;
		System.out.println("\nNome: " + ee.nome);
		ee.curso();
		
		System.out.println("____________________________");
		Universidade ep  = new Universidade();
		ep.nome = "Engenharia Elétrica";
		ep.duracao = 5;
		System.out.println("\nNome: " + ep.nome);
		ep.curso();
		
	}

}
