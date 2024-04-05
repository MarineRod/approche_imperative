package fr.algorithmie;

public class FabriquerMur {
	
	public static void main(String[] args) {
		// Tests de vérification
        verifier(3, 1, 8, true); 
        verifier(3, 1, 9, false); 
        verifier(3, 2, 10, true); 
        verifier(3, 2, 8, true); 
        verifier(3, 2, 9, false); 
        verifier(6, 1, 11, true); 
        verifier(6, 0, 11, false); 
        verifier(1, 4, 11, true); 
        verifier(0, 3, 10, true); 
        verifier(1, 4, 12, false); 
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
	    // Calculer la longueur totale couverte par les briques de longueur 1
	    int longueurSmall = nbSmall * 1;
	    
	    // Calculer la longueur totale couverte par les briques de longueur 5
	    int longueurBig = nbBig * 5;
	    
	    // Vérifier si la longueur du mur peut être couverte avec les briques disponibles
	    boolean resultat = (longueurSmall + longueurBig >= longueur) && (longueur % 5 <= nbSmall);
	    
	    return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
	    if (fabriquerMur(nbSmall, nbBig, longueur) != b) {
	        System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
	    }
	
        }
    }
