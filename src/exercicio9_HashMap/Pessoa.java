package exercicio9_hashMap;

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

	//Retorna todos os telefones em sequência
	public void getTelefone() {
		for (Integer telefone : telefone) {
			System.out.print(telefone + "  ");
		}
	}
	
	//Retorna o telefone da posição requerida
	public int getTelefonePosition(int i) {
		return telefone.get(i);
	}
	
	//Retorna o ArrayList telefone com todos os seus valores
	public ArrayList<Integer> getAllTelefone() {
		return telefone;
	}
	
	//Remove o telefone na posição determinada
	public int removeTelefonePosition(int i) {
		return telefone.remove(i);
	}
	
	//Retorna o idex e o telefone correspondente na mesma linha
	public void getIndexJuntoComTelefone() {
		for (int i =0; i < telefone.size(); i++) {
			System.out.println("["+i+"] " + getTelefonePosition(i));
		}
	}
	
	//Só retorna o tamanho do ArrrayList de telefone mesmo
	public int getTamanhoArrayListTelefone() {
		return telefone.size();
	}
	
	//Esse só adiciona mais um valor 
	public void setTelefone(ArrayList<Integer> telefone) {
		this.telefone.addAll(telefone);
	}

	//E esse substitui um valor existente
	public void setTelefonePosition(int i, int tel) {
		telefone.set(i, tel);
	}
}
