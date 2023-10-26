package exercicios_progr2;

public class Funcionario {

	public static void main(String[] args) {
		Universidade funcionario = new Universidade();
		funcionario.nome = "Maria Souza";
		
		funcionario.endereco = "Rua A, n° 5 bairro B.";
		funcionario.telefone = "3199998888";
		System.out.println("Nome: " + funcionario.nome);
		
		System.out.println("Endereço: " + funcionario.endereco);
		System.out.println("Telefone: " + funcionario.telefone);
		funcionario.funcionario();
		
		System.out.println("-----------------------------------");
		
		funcionario.nome = "João Baía";
		
		funcionario.endereco = "Rua B, n° 6 bairro A.";
		funcionario.telefone = "3199998888";
		System.out.println("Nome: " + funcionario.nome);
		
		System.out.println("Endereço: " + funcionario.endereco);
		System.out.println("Telefone: " + funcionario.telefone);
		funcionario.funcionario();
		

	}

}
