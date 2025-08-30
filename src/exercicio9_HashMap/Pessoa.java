package exercicio9_HashMap;

import java.util.ArrayList;

public class Pessoa {
	private int id, idade;
	private String nome, cpf;
	private ArrayList<Integer> telefone = new ArrayList<Integer>();
	
	public Pessoa(int id, int idade, String cpf, String nome, ArrayList<Integer> telefone) {
		this.setId(id);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setNome(nome);
		this.setTelefone(telefone);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Getter e Setter de um ArrayList, não sei se vai funcionar...
	public void getTelefone() {
		for (Integer telefone : telefone) {
			System.out.print(telefone + "  ");
		}
	}

	public void setTelefone(ArrayList<Integer> telefone) {
		this.telefone.addAll(telefone);
	}

}
