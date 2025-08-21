package exercicio4_paredeRetangular;

import java.util.Scanner;

public class Parede {
	
	public static void main(String args[]) {
		Parede parede = new Parede();
		parede.display();
		
	}
	
	double hp, lp, ha, la;
	
	
	public void display() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.print("Digite a altura da parede: ");
		hp = scan.nextDouble();
		System.out.print("Digite a largura da parede: ");
		lp = scan.nextDouble();
		System.out.println("--------------------------------------------------------");
		System.out.print("Digite a altura dos azulejos: ");
		ha = scan.nextDouble();
		System.out.print("Digite a largura dos azulejos: ");
		la = scan.nextDouble();
		double quantA = (hp * lp) / (ha * la);
		System.out.println("--------------------------------------------------------");
		System.out.println("Serão necesários " + Math.round(quantA) + " azulejos para cobrir a parde" );
		System.out.println("--------------------------------------------------------");
	}
	
}
