package funcoes;

public class ListaMaiorMedia {
	
	public static void main(String[] args) {
		double [] meuArray = {3, 2, 5};
		double meuMaiorNumero = maiorNumero(meuArray);
		double media = media(meuArray);
		
		System.out.println("Maior número encontrado foi: "+meuMaiorNumero);
		System.out.printf("Média da lista: %10.5f",media);
	}
	
	public static double maiorNumero(double [] minhaLista) {
		double maior = minhaLista[0];
		for(int i = 0; i < minhaLista.length; i = i + 1) {
			if(minhaLista[i] > maior) {
				maior = minhaLista[i];
			}
		}
		return maior;
	}
	
	public static double media(double [] minhaLista) {
		
		double soma = 0;
		double quantidadeElementos = 0;
		for(int i = 0; i < minhaLista.length; i++) {
			soma = soma + minhaLista[i];
			quantidadeElementos = quantidadeElementos + 1;
		}
		double media = soma / quantidadeElementos;
		return media;
	}

}
