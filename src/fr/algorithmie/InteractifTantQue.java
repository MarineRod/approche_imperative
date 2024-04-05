package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
        
        int nombre;
        
        do {
            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nombre = scanner.nextInt();
        } while (nombre < 1 || nombre > 10);
        
        System.out.println("Le nombre que vous avez saisi est : " + nombre);
        
        scanner.close();

	}

}
