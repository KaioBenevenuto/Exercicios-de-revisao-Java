package exercicio3_mediaSalarial;

import java.util.Scanner;

public class MediaSalarialDosFuncionarios {
	
	public static void main(String args[]) {
		MediaSalarialDosFuncionarios mediaSalarial = new MediaSalarialDosFuncionarios();
		
		mediaSalarial.tela();
	}
	
	int quantF = 0;
	
	
	public void tela() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("|      *       *    *  $ Media Salarial $  *    *         *      |");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Você deseja saber a média do salário de quantos funcionários? ");
		quantF = scan.nextInt();
		System.out.println("------------------------------------------------------------------");
		int num = 1;
		double salarios[] = new double[quantF];
		for (int contador = 0; contador < quantF; contador++) {
		System.out.print("Digite o salário do "+num+"° funcionário: ");
			salarios[contador] = scan.nextDouble();
			num++;
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("A média salarial dos seus "+ quantF +" funcionários, é de:" + mediaS(salarios));
		System.out.println("------------------------------------------------------------------");
	}
	
	public double mediaS(double salarios[]){
		double soma = 0;
		for(int cont = 0; cont < quantF; cont++) {
			soma = salarios[cont] + soma;
		}
		double media = soma / quantF;
		return media;
	}
	
}
