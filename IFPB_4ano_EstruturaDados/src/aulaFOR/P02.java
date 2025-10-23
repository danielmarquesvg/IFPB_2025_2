package aulaFOR;

public class P02 {
	
	public static void main(String[] args) {
		for(int i = 10; i >= -10; i = i - 1) {
			if(i % 3 == 0) {
				System.out.println(i+" É divisível por 3");
			} else {
				System.out.println(i+" Não é divisível por 3");
			}
		}
	}

}
