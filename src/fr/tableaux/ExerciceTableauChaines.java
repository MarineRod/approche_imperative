package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		
		String [] nomsVilles = {"Nantes", "Aubenas", "Istamboul", "Metz", "Bordeaux "};
		System.out.println(nomsVilles[0]);
		System.out.println(nomsVilles[1]);
		System.out.println(nomsVilles[2]);
		System.out.println(nomsVilles[3]);
		System.out.println(nomsVilles[4]);
		System.out.println(nomsVilles.length);
		nomsVilles[2]= "Reims";
		System.out.println(nomsVilles[0]);
		System.out.println(nomsVilles[1]);
		System.out.println(nomsVilles[2]);
		System.out.println(nomsVilles[3]);
		System.out.println(nomsVilles[4]);

}

}