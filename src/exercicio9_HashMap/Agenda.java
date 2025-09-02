package exercicio9_hashMap;

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
		System.out.println("Para editar um contato              [5]");
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
		} else if(digito == 5) {
			editContato();
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
		do {
			cpf = scanAdd.nextLine();
		}while(cpf == "");
		//Por algum motivo esse aqui está ignorando o Scaner, usando o "do/while" eu garanto que o cpf receba o valor
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
		id =  random.nextInt(1000000000);
		
		
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
			System.out.print("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade() + " | Cpf: " + pessoa.getCpf() +  " | Id: " + pessoa.getId() + " | Telefone(s): ");
			pessoa.getTelefone();
			System.out.println();
			
		}
		
		if(pessoas.size() == 0) {
			System.out.println("Não tem contatos cadastrado no sistema");
		}
		
	}
	
	public void editContato() {
		Scanner scanEdit = new Scanner(System.in);
		String cpf = "", nomeEditado = "", cpfEditado ="";
		int digito = 2, idadeEditada = 0, telefoneEdit = 0;
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("========================================");
		System.out.println("             Editar contato             ");
		System.out.println("========================================");
		System.out.print("Digite o cpf do contato: ");
		cpf = scanEdit.nextLine();
		
		//Edita o nome
		nomeEditado = alterarNome(digito, scanEdit, cpf, nomeEditado);
		
		//Edita a idade
		idadeEditada = alterarIdade(digito, scanEdit, cpf, idadeEditada);
		
		//Edita o cpf
		cpfEditado = alterarCpf(digito, scanEdit, cpf, cpfEditado);
		
		//Adiciona um novo telefone
		do {
			digito = addNewTelefone(digito, scanEdit, cpf);
		} while(digito != 1);
		
		//Edita um telefone existente
		do {
			digito = editTelefone(digito, scanEdit, cpf);
		} while(digito != -1);
		
		//Remove um telefone existente
		do {
			digito = removeTelefone(digito, scanEdit, cpf);
		} while(digito != -1);
		
		//Re-cria o contato
		//Mudou o cpf, tem que apagar tudo e criar um novo contato com a nova chave, já que não tem como mudar chave
		if(cpfEditado != "") {
			Pessoa pessoa = new Pessoa(pessoas.get(cpf).getId(), pessoas.get(cpf).getIdade(), cpfEditado, pessoas.get(cpf).getNome(), pessoas.get(cpf).getAllTelefone());
			pessoas.put(cpfEditado, pessoa);
			pessoas.remove(cpf);
		}
	}
	
	public String alterarNome(int digito, Scanner scanEdit, String cpf, String nomeEditado){
		System.out.println("Deseja alterar o nome do contato?");
		System.out.println("    Sim [0]        Não [1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != 1 && digito != 0) {
			return nomeEditado = alterarNome(digito, scanEdit, cpf, nomeEditado);
		} else if (digito == 0) {
			System.out.println("Digite o novo nome");
			System.out.print("~ ");
			do {
			 nomeEditado = scanEdit.nextLine();
			} while(nomeEditado=="");
			pessoas.get(cpf).setNome(nomeEditado);
			return nomeEditado;
		}
		return nomeEditado;
	}
	
	public int alterarIdade(int digito, Scanner scanEdit, String cpf, int idadeEditada){
		System.out.println("Deseja alterar a idade do contato?");
		System.out.println("    Sim [0]        Não [1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != 1 && digito != 0) {
			return idadeEditada = alterarIdade(digito, scanEdit, cpf, idadeEditada);
		} else if (digito == 0) {
			System.out.println("Digite a novo idade");
			System.out.print("~ ");
			idadeEditada = scanEdit.nextInt();
			pessoas.get(cpf).setIdade(idadeEditada);
			return idadeEditada;
		}
		return idadeEditada;
	}

	public String alterarCpf(int digito, Scanner scanEdit, String cpf, String cpfEditado){
		System.out.println("Deseja alterar o cpf do contato?");
		System.out.println("    Sim [0]        Não [1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != 1 && digito != 0) {
			return cpfEditado = alterarCpf(digito, scanEdit, cpf, cpfEditado);
		} else if (digito == 0) {
			System.out.println("Digite o novo cpf");
			System.out.print("~ ");
			do {
				cpfEditado = scanEdit.nextLine();
			} while(cpfEditado=="");
			return cpfEditado;
			//Se entrou aqui então nem adianta setar o valor no contato, agora é só copiar para criar uma nova conta com outra chave
		}
		return cpfEditado;
	}
	
	public int addNewTelefone(int digito, Scanner scanEdit, String cpf){
		System.out.println("Deseja adicionar um novo telefone?");
		System.out.println("    Sim [0]        Não [1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != 1 && digito != 0) {
			return digito = addNewTelefone(digito, scanEdit, cpf);
		} else if (digito == 0) {
			ArrayList<Integer> tel = new ArrayList<Integer>();
			System.out.println("Digite o novo telefone");
			System.out.print("~ ");
			tel.add(scanEdit.nextInt());
			pessoas.get(cpf).setTelefone(tel);
			return digito;
		}
		return digito;
	}
	
	public int editTelefone(int digito, Scanner scanEdit, String cpf) {
		System.out.println("======================================");
		System.out.println("        Telefones desse contato       ");
		System.out.println("======================================");
		
		pessoas.get(cpf).getIndexJuntoComTelefone();
		
		System.out.println("Digite o número que indica o telefone que você quer editar, caso não queira editar nenhum telefone digite [-1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != -1 && digito < 0 || digito > pessoas.get(cpf).getTamanhoArrayListTelefone()) {
			return digito = editTelefone(digito, scanEdit, cpf);
			
		} else if (digito > -1 && digito < pessoas.get(cpf).getTamanhoArrayListTelefone()) {
			System.out.println("Digite o número de telefone");
			System.out.print("~ ");
			pessoas.get(cpf).setTelefonePosition(digito, scanEdit.nextInt());
			return digito;
		}
		return digito;
	}
	
	public int removeTelefone(int digito, Scanner scanEdit, String cpf) {
		System.out.println("======================================");
		System.out.println("        Telefones desse contato       ");
		System.out.println("======================================");
		
		pessoas.get(cpf).getIndexJuntoComTelefone();
		
		System.out.println("Digite o número que indica o telefone que você quer remover, caso não queira remover nenhum telefone digite [-1]");
		System.out.print("~ ");
		digito = scanEdit.nextInt();
		if(digito != -1 && digito < 0 || digito > pessoas.get(cpf).getTamanhoArrayListTelefone()) {
			return digito = removeTelefone(digito, scanEdit, cpf);
			
		} else if (digito > -1 && digito < pessoas.get(cpf).getTamanhoArrayListTelefone()) {
			pessoas.get(cpf).removeTelefonePosition(digito);
			return digito;
		}
		return digito;
	}
	
}

		

