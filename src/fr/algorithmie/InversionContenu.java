package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		 
		 
		 //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais 
		 //dans l’ordre inverse.
		 
         int[] arrayCopy = new int[array.length];
         
         int j=0;
        		 
         for (int i = array.length - 1; i>= 0; i--) {
        	 
        	 arrayCopy[j]= array[i]; j++;
        	 
         }
 			 
         System.out.println(arrayCopy);
         
			for (int num : arrayCopy) {
				System.out.println(num);
			}
			
			
		 // Afficher l’ensemble des éléments des 2 tableaux
		 
			int[][] arrayBig = {array, arrayCopy};
			
			//la boucle externe parcourt chaque sous-tableau de combinedArray, 
			//tandis que la boucle interne parcourt chaque élément de chaque sous-tableau
			//et les affiche
			
			 for (int [] subArray: arrayBig) {
				 
				 for(int num: subArray) {
					 System.out.println(num);
				 }
			 }
			
			
			}
			
		 }

	


