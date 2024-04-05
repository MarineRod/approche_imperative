package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		
		  int[] tableau = {2, 4, 6, 8, 10};

	        // Calcul de la valeur booléenne
	        boolean valeurBool = (tableau.length > 0) && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);

	      
	        System.out.println(valeurBool);
	    }


	}


