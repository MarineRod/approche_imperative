package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		 int[] tableau = {0, 1, 2, 3};
		 
		//On appelle la méthode afficherTableau avec l'argument tableau
	        afficherTableau(tableau);

	        // On appelle la méthode rotationADroite avec l'argument tableau
	        rotationADroite(tableau);

	        // On appelle la méthode afficherTableau avec l'argument tableau (nouveau tableau)
	        afficherTableau(tableau);
	    }

	    // Méthode pour effectuer une rotation à droite des éléments dans un tableau
	    public static void rotationADroite(int[] tableau) {
	        if (tableau.length <= 1) {
	            return; // Rien à faire si le tableau est vide ou contient un seul élément
	             //si une méthode a un type de retour void, elle ne retourne aucune valeur, on utilise
	            //la méthode return pour quitter la méthode prématurément, sans retourner de valeur
	        }
	        int dernierElement = tableau[tableau.length - 1];
	        for (int i = tableau.length - 1; i > 0; i--) {
	            tableau[i] = tableau[i - 1];
	        }
	        tableau[0] = dernierElement;
	    }

	    // Méthode pour afficher un tableau d'entiers
	    public static void afficherTableau(int[] tableau) {
	        for (int num : tableau) {
	            System.out.print(num);
	        }
	        System.out.println();
	    }
	}
	        