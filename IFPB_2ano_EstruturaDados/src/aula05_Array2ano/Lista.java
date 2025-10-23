package aula05_Array2ano;

public class Lista {
	
	public static void main(String[] args) {
		
		int idadeDaniel = 35;
		int idadeMicaele = 17;
		int idadeRaica = 16;
		int idadeMayana = 21;
		
		/*
		int [] lista = new int [10];
		lista[0] = 35;
		lista[1] = 17;
		lista[2] = 16;
		lista[3] = 21;
		
		System.out.println(lista[2]);
		*/
		
		String [] listaNomes = new String [10];
		listaNomes[0] = "Daniel";
		listaNomes[1] = "John";
		listaNomes[2] = "Nádia";
		listaNomes[3] = "Halisson";
		
		for(int i = 0; i <= 9; i=i+1) {
			System.out.println("Nome = "+listaNomes[i]);
		}
		
		listaNomes[1] = "Aline";
		
		for(int i = 0; i <= 9; i=i+1) {
			System.out.println("Nome = "+listaNomes[i]);
		}
		
		/*
		System.out.println("Nome = "+listaNomes[0]);
		System.out.println("Nome = "+listaNomes[1]);
		System.out.println("Nome = "+listaNomes[2]);
		System.out.println("Nome = "+listaNomes[3]);
		System.out.println("Nome = "+listaNomes[4]);
		*/
	}
}
