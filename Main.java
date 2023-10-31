package exercicios_progr2;			/*Angélica de Carvalho Teixeira Matrícula 22.2.8015*/
	
public class Main {					

	public static void main(String[] args) {
		Aluno estudante = new Aluno();
        estudante.nome = "Angélica de Carvalho Teixeira";
        estudante.matricula = "22.2.8015";       
        estudante.curso = new Cursos("Sistemas de Informação", 0, 8); //no caso o código do curso foi alterado pelo numero aleatório na classe Cursos
        estudante.disciplina = new Disciplinas("Programação de Computadores 2",60,"CSI102");
     
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Matrícula: " + estudante.matricula);
        System.out.println("Curso: " + estudante.curso.nome);
        System.out.println("Código do curso: " + estudante.curso.codigo);  
        System.out.println("Duração: " + estudante.curso.duracao + " semestres.");
        System.out.println("----------------------------------------------------");
        System.out.println("Disciplinas matriculadas: " + estudante.disciplina.nome);
        System.out.println("Carga Horária Semestral: " + estudante.disciplina.cargaHoraria + " horas.");
        System.out.println("Código da disciplina: " + estudante.disciplina.codigo);
        
      
	}

}
