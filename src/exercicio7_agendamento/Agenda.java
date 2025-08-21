package exercicio7_agendamento;

import java.util.Scanner;

public class Agenda {
	Scanner scan = new Scanner(System.in);
	int pessoaId = 0, digito, maxPessoa = 5;
	String nCopia="", eCopia="";
	Contato[] contatos = new Contato[maxPessoa];

	public static void main(String args[]) {

		Agenda agenda = new Agenda();
		agenda.tela();
		
	}
	//Não está apagando e nem buscando
	
	public void criarContato() {
		if(pessoaId < maxPessoa) {
			System.out.println("----------------------------------------------------------------------------------------------------");
			//Está instanciando "Contato" para o array "contatos", que é uma instancia de "Contato", na posição 0
			//isso possibilita que seja possível adicionar o "nome" e o "email" na mesma posição do array 
			contatos[pessoaId] = new Contato();
			scan.nextLine();
			System.out.println("Digite seu nome:");
			System.out.print("~ ");	
			contatos[pessoaId].setNome(scan.nextLine());
			System.out.println("Digite seu email:");
			System.out.print("~ ");	
			contatos[pessoaId].setEmail(scan.nextLine());
			System.out.println("\nConta criada com sucesso!");
			pessoaId++;
			tela();
		} else {
			System.out.println("O limite de pessoas cadastradas foi atingido");
			tela();
		}
	}
	
	public void apagarContato() {
	
		boolean naoAchou = true;
		scan.nextLine();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Digite o nome da conta que deseja apagar:");
		System.out.print("~ ");	
		nCopia = scan.nextLine();
		
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null && contatos[i].getNome().equals(nCopia)) {
				contatos[i].setNome("");
				contatos[i].setEmail("");
				naoAchou = false;
				organizador();
				pessoaId--;
				System.out.println("\nConta apagada com sucesso!");
			} 

		}
		if(naoAchou) {
			System.out.println("\nEssa pessoa não está cadastrada na lista de contatos");
		}
		

		tela();
	}
	
	public void buscarContato() {
		boolean naoAchou = true;
		scan.nextLine();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Digite o nome da conta que deseja encontrar:");
		System.out.print("~ ");	
		nCopia = scan.nextLine();
		
		for(int i = 0; i < maxPessoa; i++) {
			if(contatos[i] != null && contatos[i].getNome().equals(nCopia) ) {
				System.out.println("\nNome: " + contatos[i].getNome());
				System.out.println("Email: " + contatos[i].getEmail());
				naoAchou = false;
			} 
			
		}
		if(naoAchou) {
			System.out.println("Essa pessoa não está cadastrada na lista de contatos");
		}

		tela();
	}
	
	
	public void organizador() {
		boolean primeiraVez = true;
		int posicaoMarcada = pessoaId-1;
		for(int i = pessoaId-1; i > 0; i--) {
			if(contatos[i] != null && primeiraVez) {
				nCopia = contatos[i].getNome();
				eCopia = contatos[i].getEmail();
				primeiraVez = false;
			}
			if(contatos[i] != null && contatos[i].getNome().equals("") && i != posicaoMarcada) {
				contatos[i].setNome(nCopia);
				contatos[i].setEmail(eCopia);
				contatos[posicaoMarcada].setNome("");
				contatos[posicaoMarcada].setEmail("");
				
			}
		}
	}
	

	public void tela() {
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("                                               Agenda                                               ");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Para criar um contato digite 1");
		System.out.println("Para buscar um contato digite 2");		
		System.out.println("Para apagar um contato digite 3");
		System.out.println("Para encerrar a sessão digite 0");
		System.out.print("~ ");	
		digito = scan.nextInt();
		if(digito == 1) {
			criarContato();
		} else if(digito == 2) {
			buscarContato();
		} else if(digito == 3) { 
			apagarContato();
		} else if(digito == 0) { 
			System.out.println("Encerrando.. . ... .. . ");
			scan.close();
		} else {
			System.out.println("Faça o favor, meu caro senhor(a), de escolher uma das opções que lhe apresentei!");
			tela();
		}
	}
}
