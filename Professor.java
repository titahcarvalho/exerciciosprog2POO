package exercicios_progr2;

public class Professor extends Funcionario{

	public static void main(String[] args) {
		Universidade professor = new Universidade();
		professor.nome = "Carla Da Silva";
		professor.titulo = "Mestre";
		professor.area= "Segurança";
		System.out.println("Nome: " + professor.nome);
		System.out.println("Título: " + professor.titulo);
		System.out.println("Área de atuação: " + professor.area);
		professor.funcionario();
		
		System.out.println("-------------------------------------------");
		
		professor.nome = "José Vieira";
		professor.titulo = "Doutor";
		professor.area= "Inteligência Artificial";
		System.out.println("Nome: " + professor.nome);
		System.out.println("Título: " + professor.titulo);
		System.out.println("Área de atuação: " + professor.area);
		professor.funcionario();

	}

}
