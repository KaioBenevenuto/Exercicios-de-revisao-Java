package exercicio8_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPessoa {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String nomeDigitado;
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("João");
		nomes.add("Mario");
		nomes.add("Karla");
		nomes.add("Felipe");
		nomes.add("Jordan");
		nomes.add("Joana");
		nomes.add("Carlos");
		nomes.add("Maria");
		nomes.add("Joaquim");
		nomes.add("Jhonata");
		nomes.add("Laura");
		nomes.add("Luana");
		nomes.add("Lauricio");
		nomes.add("Carmen");


		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.print("\nDigite um nome para buscar na lista: ");
		nomeDigitado = scan.nextLine();
		
		for (int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).substring(0, 3).equals(nomeDigitado.substring(0, 3)) ) {
				System.out.println("O nome digitado é igual ou parecicido com " + nomes.get(i));
			}
			
		}
	}
	
	
}
