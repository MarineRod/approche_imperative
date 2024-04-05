package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		
		// Quelle est la moyenne des éléments du tableau ? 
		
		int somme =0;
		
		for (int num: array) {
			
			somme += num; // on ajoute chaque élément à la variable somme initialisée à 0
			
			
		}
		
		int moyenne = somme/array.length;
		
		
		System.out.println(moyenne);

	}

}
