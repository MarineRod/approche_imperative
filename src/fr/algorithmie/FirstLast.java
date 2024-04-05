package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		
		 int[] tableau = {2, 4, 6, 8, 10};

	        // Calcul de la valeur booléenne
	        boolean valeurBool = (tableau.length >= 1) && (tableau[0] == tableau[tableau.length - 1]);

	      
	        System.out.println(valeurBool);
	    }


	}

