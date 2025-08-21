package exercicio2_dadosPessoais;

public class DadosPessoaisDe10Pessoas {
	String[] pessoasSexo = {"F", "M", "M", "F", "F", "M", "M", "F", "F", "F"};
	double[] altura = {1.60, 1.75, 1.82, 1.72, 1.59, 1.79, 1.90, 1.80, 1.77};
	
	public static void main(String args[]) {
		DadosPessoaisDe10Pessoas dadosP = new DadosPessoaisDe10Pessoas();
		dadosP.tela();
	}
	
	public int numeroDeMulheres() {
		int numF = 0;
		for(int contador = 0; contador < pessoasSexo.length; contador++) {
			if(pessoasSexo[contador] == "F") {
				numF = numF + 1;
			}
		}
		return numF;
	}
	public double maiorAltura() {
		double maiorA = 0;
		for(int contador = 0; contador < altura.length; contador++) {
			if(altura[contador] > maiorA) {
				maiorA = altura[contador];
			}
		}
		return maiorA;
	}
	public double menorAltura() {
		double menorA = 10;
		for(int contador = 0; contador < altura.length; contador++) {
			if(altura[contador] < menorA) {
				menorA = altura[contador];
			}
		}
		return menorA;
	}
	public double mediaDaAlturaDosHomens() {
		//Soma as alturas
		double soma = 0;
		int quantidadeDeM = 0;
		for(int contador = 0; contador < pessoasSexo.length; contador++) {
			if(pessoasSexo[contador] == "M") {
				soma = altura[contador] + soma;
				quantidadeDeM ++;
			}
		}
		
		//Divide pela quantidade para tirar a média
		double media = 0;
		media = soma / quantidadeDeM;
		return media;
	}
	public void tela() {
		System.out.println("--------------------------------");
		System.out.println("              Dados             ");
		System.out.println("--------------------------------");
		System.out.println("Maior altura: " + maiorAltura());
		System.out.println("Menor altura: " + menorAltura() );
		System.out.println("--------------------------------");
		System.out.println("Média das alturas dos homens: " + mediaDaAlturaDosHomens());
		System.out.println("--------------------------------");
		System.out.println("Número de mulheres: " + numeroDeMulheres());
		System.out.println("--------------------------------");
	}
}
