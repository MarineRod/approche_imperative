package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		 //en initialisant avec Integer.MIN_VALUE nous nous assurons que la 1ere valeur saisie par l'utilisateur
		//sera toujours plus grande que max, car Integer.MIN_VALUE représente la valeur minimale possible pour un entier 
        int max = Integer.MIN_VALUE;

        System.out.println("Entrez 10 nombres :");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nombre " + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
            }
        }

        System.out.println("Le plus grand nombre saisi est : " + max);

        scanner.close();

	}

}
