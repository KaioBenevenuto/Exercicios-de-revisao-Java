package exercicio6_cavalosParaLevantarUmaMassa;

import java.util.Scanner;

public class Cavalo {
	public static void main(String arg[]) {
		Cavalo cavalo = new Cavalo();
		cavalo.tela();
	}
	
	double m, h, t, quantCavalos;

	public void tela() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");
		System.out.println("-~~~~~~~~~~~~~~~~~~~~~~~~~~~~Cavalo~~~~~~~~~~~~~~~~~~~~~~~~~~-");
		System.out.println("--------------------------------------------------------------");
		System.out.print("Qual é o tamanho da massa? ");
		m = scan.nextDouble();
		System.out.print("Em quantos metros ela deve ser levantada? ");
		h = scan.nextDouble();
		System.out.print("Em quantos segundos? ");
		t = scan.nextDouble();
		System.out.println("--------------------------------------------------------------");
		quantCavalos = (m * h / t) / 745.6999;
		System.out.println("Serão necessários " + quantCavalos + " cavalos para levantar uma massa de " + m + " quilogramas a uma altura de " +h+ " mestros em " +t+ " segundos.");
		System.out.println("--------------------------------------------------------------");

	}
}
