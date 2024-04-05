package fr.algorithmie;


import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[5]; // Initialisation du tableau avec une taille initiale de 5
        int taille = 0; // Taille actuelle du tableau

        int choix;
        do {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (taille == tableau.length) {
                        // Si le tableau est plein, agrandir le tableau
                        int[] nouveauTableau = new int[taille * 2]; // Double la taille du tableau
                        for (int i = 0; i < taille; i++) {
                            nouveauTableau[i] = tableau[i];
                        }
                        tableau = nouveauTableau;
                    }
                    System.out.print("Entrez un nombre à ajouter : ");
                    int nombre = scanner.nextInt();
                    tableau[taille] = nombre; //affecte la valeur nombre à l'élément du tableau à l'indice taille, c'est comme si c'était i
                    taille++;
                    break;
                case 2:
                    System.out.println("Les nombres existants :");
                    for (int i = 0; i < taille; i++) {
                        System.out.println(tableau[i]);
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();

	}

}
