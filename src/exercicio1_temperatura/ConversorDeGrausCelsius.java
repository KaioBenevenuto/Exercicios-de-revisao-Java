package exercicio1_temperatura;

import java.util.Scanner;

public class ConversorDeGrausCelsius {
	
	private double C, K, F, Re, Ra; 
	
	public void constructor(double C, double K, double F, double Re, double Ra) {
		this.setC(C= 0);
		this.setK(K= 0);
		this.setF(F= 0);
		this.setRe(Re= 0);
		this.setRa(Ra= 0);	
	}
	
	public double converteCparaF(double c, double f){
		return f = c * 1.8 + 32;
	}
	public double converteCparaK(double c, double k){
		return k = c + 273.15;
	}
	public double converteCparaRe(double c, double re){
		return re = c * 0.8;
	}
	public double converteCparaRa(double c, double ra){
		return ra = c * 1.8 + 32 + 459.67;
	}
	
	public static void main(String[] args) { 
		ConversorDeGrausCelsius conversor = new ConversorDeGrausCelsius();
		conversor.tela();
	}
	
	public void tela() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Digite a temperatura em graus Celsius: ");
		setC(scan.nextDouble());
		System.out.println("--------------------------------------");
		System.out.println("A temperatura convertida em Kelvin fica: " + converteCparaK(getC(), getK()));
		System.out.println("A temperatura convertida em Fahrenheit fica: " + converteCparaF(getC(), getF()));
		System.out.println("A temperatura convertida em Réaumur fica: " + converteCparaRe(getC(), getRe()));
		System.out.println("A temperatura convertida em Rankine fica: " + converteCparaRa(getC(), getRa()));
	}
	
	public void setC(double c) {
		C = c;
	}
	public double getC() {
		return C;
	}
	
	public void setK(double k) {
		K = k;
	}
	public double getK() {
		return K;
	}

	public void setF(double f) {
		F = f;
	}
	public double getF() {
		return F;
	}
	
	public void setRe(double re) {
		Re = re;
	}
	public double getRe() {
		return Re;
	}

	public void setRa(double ra) {
		Ra = ra;
	}
	public double getRa() {
		return Ra;
	}
}
