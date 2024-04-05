package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int nombre;
        
        do {
            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nombre = scanner.nextInt();
        } while (nombre < 1 || nombre > 10);
        
        System.out.println("Table de multiplication de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }

        scanner.close();
        
       

	}

}


	
