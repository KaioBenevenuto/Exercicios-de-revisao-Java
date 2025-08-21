package exercicio8_cadastrarPessoa;

public class Pessoa {
	private int id, cpf, idade;
	private String nome;
	
	public void pessoa() {
		this.idade = 0;
		this.cpf = 0;
		this.nome = "";
		this.id = 0;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
