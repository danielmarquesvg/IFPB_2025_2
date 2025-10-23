package aula05_Array;

import java.util.Scanner;

public class MeuPrimeiroArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		//TIPO [] Nome ARRAY = new TIPO [TAMANHO];
		String [] listaNomes = new String[5];
		
		//repetição para o usuário digitar os itens
		for(int i = 0; i < 5; i = i + 1) {
			System.out.println("Por favor, digite um valor: ");
			String nome = scanner.next();
			listaNomes[i] = nome;
		}
		
		for(int i = 0; i < 5; i = i + 1) {
			System.out.println("ListaNomes["+i+"] = "+listaNomes[i]);
		}
		
		
	}
}
