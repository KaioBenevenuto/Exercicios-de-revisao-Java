package exercicio8_cadastrarPessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CadastrarPessoa {
	ArrayList <Pessoa> pessoa = new ArrayList<Pessoa>();
	int quantidade = -1;
	public static void main(String args[]) {
		CadastrarPessoa cadastro = new CadastrarPessoa();
		cadastro.tela();
	}
	
	public void tela(){ 
		Scanner scan0 = new Scanner(System.in);
		int digito = 0 ;
		System.out.println("=================================================");
		System.out.println("         Cadastro de pessoas no sistema          ");
		System.out.println("=================================================");
		System.out.println("Digite 1, para adicionar uma nova pessoa.");
		System.out.println("Digite 2, para remover uma pessoa.");
		System.out.println("Digite 3, para editar o nome ou a idade de uma pessoa.");
		System.out.println("Digite 0, para limpar os dados cadastrados.");
		System.out.print("~ ");
		digito = scan0.nextInt();
		System.out.println("=================================================");
		if(digito == 1) {
			adicionarPessoa();
		} else if(digito == 2) {
			removerPessoa();
		} else if(digito == 3) {
			editarPessoa();
		} else if(digito == 0){
			limpar();
		} else {
			System.out.println("Escolha uma das opções apresentadas!");
			tela();
		}
		
	}
	
	public void adicionarPessoa() {
		quantidade++;
		Scanner scan1 = new Scanner(System.in);
		//Aqui eu estou usando a mesma abordagem que o Gu ensinou na classe Agenda, só que com ArrayList
		pessoa.add(new Pessoa());
		System.out.print("Nome: ");
		pessoa.get(quantidade).setNome(scan1.nextLine());
		System.out.print("Idade: ");
		pessoa.get(quantidade).setIdade(scan1.nextInt());
		System.out.print("Cpf: ");
		pessoa.get(quantidade).setCpf(scan1.nextInt());
		Random random = new Random();
		pessoa.get(quantidade).setId(random.nextInt(10, 100));	
		
		tela();
	}
	
	int idCopiado = 0;
	public void removerPessoa() {
		Scanner scan2 = new Scanner(System.in);
		int tamanhoDoArraylistAntesDaRemocao = pessoa.size();
		
		for(Pessoa pessoa: pessoa) {
			System.out.println("Id: " + pessoa.getId() + "| Nome:" + pessoa.getNome() + "| Idade:" + pessoa.getIdade() + "| Cpf:" + pessoa.getCpf());
		}
		
		System.out.println("=================================================");
		System.out.println("Digite o id da pessoa que você quer remover: ");
		System.out.print("~ ");
		idCopiado = scan2.nextInt();
		
		pessoa.removeIf(pessoa -> pessoa.getId() == idCopiado);
		if(tamanhoDoArraylistAntesDaRemocao == pessoa.size()) {
			System.out.println("Essa pessoa não está cadastrada no sistema.");
		}
		tela();
		
	}
	
	public void editarPessoa() {
		Scanner scan3 = new Scanner(System.in);
		boolean naoExiste = true;
		
		for(Pessoa pessoa: pessoa) {
			System.out.println("Id: " + pessoa.getId() + "| Nome:" + pessoa.getNome() + "| Idade:" + pessoa.getIdade() + "| Cpf:" + pessoa.getCpf());
		}
		
		System.out.println("=================================================");
		System.out.println("Digite o id da pessoa que você quer editar: ");
		System.out.print("~ ");
		idCopiado = scan3.nextInt();
		
		for(Pessoa pessoa : pessoa) {
			if(pessoa.getId() == idCopiado){
				System.out.print("Nome: ");
				pessoa.setNome(scan3.nextLine());
				pessoa.setNome(scan3.nextLine());
				System.out.print("Idade: ");
				pessoa.setIdade(scan3.nextInt());
				System.out.print("Cpf: ");
				pessoa.setIdade(scan3.nextInt());
		
				Random random = new Random();
				pessoa.setId(random.nextInt(10, 100));
				
				naoExiste = false;
			}
		}
		if(naoExiste) {
			System.out.println("Essa pessoa não está cadastrada no sistema.");
		}
		
		tela();
	}
	public void limpar() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		pessoa.clear();
		tela();
	}
	

}
