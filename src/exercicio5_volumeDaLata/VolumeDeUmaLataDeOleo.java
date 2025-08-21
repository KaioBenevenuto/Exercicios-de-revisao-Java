package exercicio5_volumeDaLata;

import java.util.Scanner;

public class VolumeDeUmaLataDeOleo {
	
	public static void main(String args[]) {
		VolumeDeUmaLataDeOleo volumeOleo = new VolumeDeUmaLataDeOleo();
		volumeOleo.tela();
		
	}
	
	double R, A, V;

	public void tela() {
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("                Volume da lata de óleo                ");
		System.out.println("------------------------------------------------------");
		System.out.print("Digite o raio da lata: ");
		R = scan.nextDouble();
		System.out.println("------------------------------------------------------");
		System.out.print("Digite a altura: ");
		A = scan.nextDouble();
		System.out.println("------------------------------------------------------");
		V = Math.PI * R * R * A; //Math.PI -> é o valor de PI -> 3,14...
		System.out.println("O volume da lata é : " + V+"m³");
		System.out.println("------------------------------------------------------");
	}
}
