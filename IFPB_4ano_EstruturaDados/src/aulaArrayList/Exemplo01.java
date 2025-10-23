package aulaArrayList;

import java.util.ArrayList;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		ArrayList <String> lista = new ArrayList<String>();
		System.out.println("Tamanho do meu ArrayList = "+lista.size());
		
		//Adicionando elementos
		lista.add("Daniel");
		lista.add("César");
		lista.add("Rafael");
		lista.add(0, "igor");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Lista["+i+"] = "+lista.get(i));
		}
		
		System.out.println("Tamanho = "+lista.size());
		
		lista.remove("igor");
		lista.remove(1);
		
		System.out.println();
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Lista["+i+"] = "+lista.get(i));
		}
		
		lista.remove("Arthur");
		lista.remove("Simão");
		lista.remove(100);
	}

}
