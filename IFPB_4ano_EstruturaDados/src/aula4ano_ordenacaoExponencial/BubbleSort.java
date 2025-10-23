package aula4ano_ordenacaoExponencial;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		//criando array
		int [] lista = new int [10];
		
		//preenchendo o array
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Digite o "+(i+1)+" valor: ");
			lista[i] = scanner.nextInt();
		}
		
		int comparacoes = 0;
		for(int i = 0; i < lista.length; i++) {
			for(int j = 0; j < lista.length - 1; j++) {
				comparacoes = comparacoes + 1;
				if(lista[j] > lista[j+1]) {
					int auxiliar = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = auxiliar;
				}		
			}
		}
		
		//exibindo a lista final
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Lista["+i+"] = "+lista[i]);
		}
		System.out.println("Comparações = "+comparacoes);
	}
}
