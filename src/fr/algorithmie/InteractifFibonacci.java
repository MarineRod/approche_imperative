package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un rang N pour la suite de Fibonacci : ");
        int N = scanner.nextInt();

        int fibonacciN = fibonacci(N);
        System.out.println("Le nombre de rang " + N + " dans la suite de Fibonacci est : " + fibonacciN);

        scanner.close();
    }

	//Ses deux premiers termes sont 0 et 1, et ensuite, chaque terme successif est la somme des deux termes précédents.
	//Ainsi 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, etc.
	//Comme c’est la coutume, nous dénoterons par Fn le n-ème terme de cette suite, en commençant par n=0. 
	//Ainsi donc, la suite de Fibonacci F0, F1, F2, … peut être entièrement définie par les formules suivantes :
    //F0=0
	//F1=1
	//Fn=Fn-2+Fn-1 pour n>=2
	
    // Méthode pour calculer le nombre de rang N dans la suite de Fibonacci
    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            int a = 0; // initialise la première valeur de la suite de Fibonacci à 0
            int b = 1; // initialise la 2e valeur de la suite de Fibonacci à 1
            int c = 0; // initialise une variable temporaire c à 0 qui va contenir la somme des 2 valeurs précédentes à chaque itération
            for (int i = 2; i <= N; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}

