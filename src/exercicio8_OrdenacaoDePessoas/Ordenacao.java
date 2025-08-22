package exercicio8_OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Comparator;

public class Ordenacao {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	
	public static void main(String args[]) {
		Ordenacao ordem = new Ordenacao();
		ordem.tela();
	}
	
	public void tela() {
		pessoas.add(new Pessoa());
		pessoas.get(0).setNome("Kaio");
		pessoas.get(0).setIdade(22);
		
		pessoas.add(new Pessoa());
		pessoas.get(1).setNome("João");
		pessoas.get(1).setIdade(80);
		
		pessoas.add(new Pessoa());
		pessoas.get(2).setNome("Samara");
		pessoas.get(2).setIdade(21);
		
		pessoas.add(new Pessoa());
		pessoas.get(3).setNome("Julia");
		pessoas.get(3).setIdade(16);
		
		pessoas.add(new Pessoa());
		pessoas.get(4).setNome("Felipe");
		pessoas.get(4).setIdade(38);
		
		pessoas.add(new Pessoa());
		pessoas.get(5).setNome("Alice");
		pessoas.get(5).setIdade(28);
		
		pessoas.add(new Pessoa());
		pessoas.get(6).setNome("Zecarias");
		pessoas.get(6).setIdade(12);
		
		System.out.println("=====================================================================");
		System.out.println("                             Desordenado                             ");
		System.out.println("=====================================================================");
		for (Pessoa listPessoas : pessoas) {
			System.out.println(listPessoas.getNome() + "|" + listPessoas.getIdade());
		}
		
		System.out.println("=====================================================================");
		System.out.println("                          Ordenado por nome                          ");
		System.out.println("=====================================================================");
		pessoas.sort(Comparator.comparing(Pessoa::getNome));
		for (Pessoa listPessoas : pessoas) {
			System.out.println(listPessoas.getNome() + "|" + listPessoas.getIdade());
		}
		
		System.out.println("=====================================================================");
		System.out.println("                         Ordenado por idade                          ");
		System.out.println("=====================================================================");
		pessoas.sort(Comparator.comparing(Pessoa::getIdade));
		for (Pessoa listPessoas : pessoas) {
			System.out.println(listPessoas.getNome() + "|" + listPessoas.getIdade());
		}
		
	}
}
