package Construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa guilherme = new Pessoa("Guilherme","48415034806");
		
		//definimos o endereço de marcos
		guilherme.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do guilherme ?
		
		//imprimindo o guilherme sem o nome e cpf
		
		System.out.println(guilherme.getNome() + "-" + guilherme.getCpf());
	}
}