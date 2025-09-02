package exercicio8_ordenacaoDePessoas_e_estatisticaDeIdadde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class EstatisticaDeIdade {
	
	ArrayList <Pessoa> listPessoa = new ArrayList <Pessoa>(); 
	
	public static void main(String args[]) {
		EstatisticaDeIdade estatistica = new EstatisticaDeIdade();
		estatistica.tela();
		
	}
	
	public void tela() {
		listPessoa.add(new Pessoa());
		listPessoa.get(0).setNome("Kaio");
		listPessoa.get(0).setIdade(22);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(1).setNome("João");
		listPessoa.get(1).setIdade(80);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(2).setNome("Samara");
		listPessoa.get(2).setIdade(21);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(3).setNome("Julia");
		listPessoa.get(3).setIdade(16);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(4).setNome("Felipe");
		listPessoa.get(4).setIdade(38);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(5).setNome("Alice");
		listPessoa.get(5).setIdade(28);
		
		listPessoa.add(new Pessoa());
		listPessoa.get(6).setNome("Zecarias");
		listPessoa.get(6).setIdade(12);
				
		System.out.println("=================================================================");
		System.out.println("                  Media de idade das pessoas                     ");
		System.out.println("=================================================================");
		System.out.println(media());
		System.out.println("=================================================================");
		System.out.println("                     A pessoa mais velha                         ");
		System.out.println("=================================================================");
		System.out.println(maior());
		System.out.println("=================================================================");
		System.out.println("                      A pessoa mais nova                         ");
		System.out.println("=================================================================");
		System.out.println(menor());

	}

	public double media() {
		int soma = 0;
		double media = 0;
		for(Pessoa listPessoa : listPessoa) {
			soma = listPessoa.getIdade() + soma;
		}
		media = soma / listPessoa.size();
		return media;
	}
	
	public String maior() {
		int maior = 0;
		String nome = "";
		for(Pessoa listPessoa : listPessoa) {
			if(maior < listPessoa.getIdade()) {
				maior = listPessoa.getIdade();
				nome = listPessoa.getNome();
			}
		}
		return nome + " com " + maior + " anos";
	}
	
	public String menor() {
		int menor = 200;
		String nome = "";
		for(Pessoa listPessoa : listPessoa) {
			if(menor > listPessoa.getIdade()) {
				menor = listPessoa.getIdade();
				nome = listPessoa.getNome();
			}
		}
		return nome + " com " + menor + " anos";	}
}
