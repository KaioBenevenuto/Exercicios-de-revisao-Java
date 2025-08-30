package exercicio9_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Agenda {
	HashMap<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		Agenda agenda = new Agenda();
		agenda.tela();
		
	}
	
	public void tela() {
		int digito = 0;
		System.out.println("========================================");
		System.out.println("                 Agenda                 ");
		System.out.println("========================================");
		System.out.println("Para adicionar um novo contato      [1]");
		System.out.println("Para buscar um contato              [2]");
		System.out.println("Para remover um contato             [3]");
		System.out.println("Para listar todos os contatos       [4]");
		System.out.println("Para encerrar o sistema             [0]");
		System.out.println("========================================");
		System.out.print("~ ");
		digito = scan.nextInt();
		
		if(digito == 1) {
			addNewContato();
			tela();
		} else if(digito == 2) {
			searchContato();
			tela();
		} else if(digito == 3) {
			removeContato();
			tela();
		} else if(digito == 4) {
			listContato();
			tela();
		} else if(digito == 0){
			System.out.print("\nEncerrando.. ... . ..");
			scan.close();
		} else {
			System.out.println("Escolha uma das opções ofertadas");
			tela();
		}
	}
	
	public void addNewContato() {
		Scanner scanAdd = new Scanner(System.in);
		String nome = "", cpf = "", respostaString; 
		char resposta = 'a';
		int id = 0, idade = 0;
		ArrayList<Integer> telefone = new ArrayList<Integer>();
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("========================================");
		System.out.println("          Adicionando contato           ");
		System.out.println("========================================");
		System.out.print("Digite o nome do contato: ");
		nome = scanAdd.nextLine();
		System.out.print("A sua idade: ");
		idade = scanAdd.nextInt();
		System.out.print("O seu cpf: ");
		cpf = scanAdd.nextLine();
		cpf = scanAdd.nextLine();
		//Por algum motivo esse aqui só funciona se eu chamar 2x
		System.out.print("O número de telefone dele(a): ");
		telefone.add(scanAdd.nextInt());
		do {
			System.out.println("Se o contato NÃO tem mais telefones, digite [n], caso tenha, digite qualquer coisa");
			System.out.print("~ ");
			respostaString = scanAdd.next();
			resposta = respostaString.charAt(0);
			if(resposta != 'n') {
				System.out.print("O número de telefone dele(a): ");
				telefone.add(scanAdd.nextInt());
			}
		}while(resposta != 'n');
		
		Random random = new Random();
		id = random.nextInt();
		System.out.println("========================================");
		
		
		//Usei o método construtor da classe Pessoa para setar os valores dessa vez
		Pessoa pessoa = new Pessoa(id, idade, cpf, nome , telefone);
		pessoas.put(cpf, pessoa);
	}
	
	public void searchContato() {
		Scanner scanSearch = new Scanner(System.in);
		String cpf = "";
		boolean portaAberta = true;
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("========================================");
		System.out.println("             Buscar contato             ");
		System.out.println("========================================");
		System.out.print("Digite o cpf do contato: ");
		cpf = scanSearch.nextLine();
		
		
		for (Pessoa pessoa: pessoas.values()) {
			if(pessoa.getCpf().equals(cpf)) {
				System.out.print("\nNome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade() + " | Cpf: " + pessoa.getCpf() +  " | Id: " + pessoa.getId() + " | Telefone(s): ");
				pessoa.getTelefone();
				System.out.println();
				portaAberta = false;
			}
			
		}
		if(portaAberta){
			System.out.println("Esse contato não foi cadastrado no sistema");
		}
	}
	
	public void removeContato() {
		Scanner scanRemove = new Scanner(System.in);
		String cpf = "";
		boolean portaAberta = true;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("========================================");
		System.out.println("             Remover contato            ");
		System.out.println("========================================");
		System.out.print("Digite o cpf do contato: ");
		cpf = scanRemove.nextLine();
		
		for (Pessoa pessoa: pessoas.values()) {
			if(pessoa.getCpf().equals(cpf)) {
				pessoas.remove(cpf);
				portaAberta = false;
			}
		}
		if(portaAberta) {
			System.out.println("Esse contato não foi cadastrado no sistema");
		}
	}
		
	public void listContato() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("========================================");
		System.out.println("             Listar contatos            ");
		System.out.println("========================================");
		
		for (Pessoa pessoa: pessoas.values()) {
			System.out.print("\nNome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade() + " | Cpf: " + pessoa.getCpf() +  " | Id: " + pessoa.getId() + " | Telefone(s): ");
			pessoa.getTelefone();
			System.out.println();
			
		}
		
		if(pessoas.size() == 0) {
			System.out.println("Não tem contatos cadastrado no sistema");
		}
		
	}
}

		

