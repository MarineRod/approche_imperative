package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		 
		 // Rechercher le plus petit élément du tableau
		 
		 int min = array[0]; //On suppose que le premier élément est le maximum
			
			for (int j : array)
				
			{
				//le code parcourt ensuite le reste du tableau à partir du 2e élément,
				//à chaque itération, il compare l'élément actuel avec celui trouvé jusqu'à présent.
				//Si l'élément actuel est inférieur au minimum = met à jour la valeur de min
				
				if (j<min) {
					min=j;
				}
				
				
			}
			
			System.out.println(min);
		}


	}


