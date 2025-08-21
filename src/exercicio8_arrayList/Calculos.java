package exercicio8_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculos {
	
	ArrayList<Double> numeros = new ArrayList<Double>();
	
	public static void main(String arg[]) {
		Calculos calc = new Calculos();
		calc.tela();
	}
	
	public void tela(){
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("                        Calculos                        ");
		System.out.println("--------------------------------------------------------");
		System.out.println("Digite 5 números: ");
		for(int i = 0; i < 5; i++) {
			numeros.add(scan.nextDouble());		
		}		
		System.out.println("--------------------------------------------------------");
		System.out.println("A soma desses valores é " + soma());
		System.out.println("A média é " + media());
		System.out.println("O maior número é " + maior());
		System.out.println("O menor número é " + menor());
		System.out.println("O numeros na poção do indíce 3, 5 e 2 são respectivamente: " + posicao());
		System.out.println("A raiz quadrada dos números do indíce 1 e 4 são respectivamente: " + raiz());
		
		

 
	}
	
	public double soma() {
		double soma = 0;
		for(Double num:numeros) {
			soma = num + soma;
		}
		return soma;
	}
	
	public double media() {
		double media = 0; 
		return media = soma() / numeros.size();
	}
	
	public double maior() {
		return Collections.max(numeros);
	}
	public double menor() {
		return Collections.min(numeros);
	}
	
	public String posicao() {
		double indice = -1, numeroIndice2 = 0, numeroIndice4 = 0, numeroIndice1 = 0;
		
		for(Double num: numeros) {
			indice++;
			if(indice == 2) {
				numeroIndice2 = num;
			}
			if(indice == 4) {
				numeroIndice4 = num;
			}
			if(indice == 1) {
				numeroIndice1 = num;
			}
		}
		return String.valueOf(numeroIndice2 + ", " + numeroIndice4 + " e " + numeroIndice1);
	}
	
	public String raiz() {
		double indice = -1, numeroIndice0 = 0, numeroIndice3 = 0;
		
		for(Double num: numeros) {
			indice++;
			if(indice == 0) {
				numeroIndice0 = num;
			}
			if(indice == 3) {
				numeroIndice3 = num;
			}
		}
		return String.valueOf(Math.sqrt(numeroIndice0) + " e " + Math.sqrt(numeroIndice3));
	
	}
}
