package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
        int[] array1 =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int[] array2 =  {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		
        // Déterminer la longueur du tableau de somme
        int length = Math.max(array1.length, array2.length);

        // Création du tableau contenant la somme des deux tableaux
        int[] sommeArray = new int[length];
        for (int i = 0; i < length; i++) {
            int valeur1 = (i < array1.length) ? array1[i] : 0; // Si l'index est dans les limites de array1, prendre la valeur correspondante, sinon 0
            int valeur2 = (i < array2.length) ? array2[i] : 0; // Si l'index est dans les limites de array2, prendre la valeur correspondante, sinon 0
            sommeArray[i] = valeur1 + valeur2;
        }

        // Affichage de la somme des deux tableaux
        
        for (int num : sommeArray) {
            System.out.println(num);
        }
    }
}

	
