package exercicio8_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeNotas {
	
	ArrayList<Double> notaDosAlunos = new ArrayList<Double>();
	int quantidadeDeAlunos = 0;
	
	public static void main(String args[]) {
		MediaDeNotas arrayList = new MediaDeNotas();
		arrayList.tela();
	}
	
	public void tela() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("      Média dos alunos de uma turma      ");
		System.out.println("-----------------------------------------");
		System.out.print("Quantos alunos tem na sua turma? ");
		quantidadeDeAlunos = scan.nextInt();
		System.out.println("Digite abaixo as notas deles: ");
		for(int i = 0; i < quantidadeDeAlunos; i++) {
			notaDosAlunos.add(scan.nextDouble());
		}
		System.out.println("-----------------------------------------");

		System.out.println("A média das notas desses alunos é: " + Math.round(media()));
		System.out.println("-----------------------------------------");

				
	}
	
	public Double media() {
		double soma = 0;
		double media = 0;
		for(Double notas: notaDosAlunos) {
			soma = notas + soma;
		}
		media = soma / quantidadeDeAlunos;
		return media;
	}
}
