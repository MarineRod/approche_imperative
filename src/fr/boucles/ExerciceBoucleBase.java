package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {

			System.out.println(i);
		}

		for (int i = 0; i < 20; i++) {

			System.out.println("Marine");

		}
		
		for (int j = 2; j <= 100; j=j+2) {
			 
				System.out.println(j);
			}

		for (int j = 2; j <= 100; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
		
		for (int j = 1; j < 100; j=j+1) {
			 
			System.out.println(j);
		}
		
		
		for (int j = 2; j <= 100; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
		
	}
	

}
