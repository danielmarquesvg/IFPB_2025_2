package aula05_Array2ano;

public class ListaDeNomes {
	
	public static void main(String[] args) {
		
		String [] alunos = {"Raica", "Flávio", "Heloísa","Hellen", "Raíssa", "Micaele", "Layonara", "Mayana", "Daniel", "Kelvin", "João", "Maria", "Andriele", "Lucas", "Paulo", "Gustavo"};
		
		for(int i = 0; i < alunos.length; i=i+1) {
			System.out.println("Alunos = "+alunos[i]);
		}
	}

}
