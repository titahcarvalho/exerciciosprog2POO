package exercicios_progr2;			/*Angélica de Carvalho Teixeira Matrícula 22.2.8015*/
	
public class Main {					

	public static void main(String[] args) {
		Aluno estudante = new Aluno();//esta sem construtor - no caso 
        estudante.setNome ("Angélica de Carvalho Teixeira");
        estudante.setMatricula ("22.2.8015");       
        Cursos c =  new Cursos("Sistemas de Informação", 0, 8);
        estudante.setCurso (c); //no caso o código do curso foi alterado pelo numero aleatório na classe Cursos
        estudante.setDisciplina (new Disciplinas("Programação de Computadores 2",60,"CSI102"));
     //fazer o mesmo com a disciplina
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Curso: " + estudante.getCurso().getNome());
        System.out.println("Código do curso: " + estudante.getCurso().getCodigo());  
        System.out.println("Duração: " + estudante.getCurso().getDuracao() + " semestres.");
        System.out.println("----------------------------------------------------");
        System.out.println("Disciplinas matriculadas: " + estudante.getDisciplina().getNome());
        System.out.println("Carga Horária Semestral: " + estudante.getDisciplina().getCargaHoraria() + " horas.");
        System.out.println("Código da disciplina: " + estudante.getDisciplina().getCodigo());
        
        System.out.println("-----------------------NOVO ALUNO-----------------------------");
        
        Aluno estudante1 = new Aluno();
        Cursos d = new Cursos ("Engenharia de Computação", 0, 8);
        estudante1.setNome ("Chico de Carvalho ");
        estudante1.setMatricula ("01.2.3456");       
        estudante1.setCurso (d); //no caso o código do curso foi alterado pelo numero aleatório na classe Cursos
        estudante1.setDisciplina (new Disciplinas("Programação de Computadores 2",60,"CSI102"));
     //fazer o mesmo com a disciplina
        System.out.println("Nome: " + estudante1.getNome());
        System.out.println("Matrícula: " + estudante1.getMatricula());
        System.out.println("Curso: " + estudante1.getCurso().getNome());
        System.out.println("Código do curso: " + estudante1.getCurso().getCodigo());  
        System.out.println("Duração: " + estudante1.getCurso().getDuracao() + " semestres.");
        System.out.println("----------------------------------------------------");
        System.out.println("Disciplinas matriculadas: " + estudante1.getDisciplina().getNome());
        System.out.println("Carga Horária Semestral: " + estudante1.getDisciplina().getCargaHoraria() + " horas.");
        System.out.println("Código da disciplina: " + estudante1.getDisciplina().getCodigo());
        
        
      
	}

}
