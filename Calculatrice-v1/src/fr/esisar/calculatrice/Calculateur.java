package fr.esisar.calculatrice;

public class Calculateur {

	public static void main(String[] args) {
		
		Calculatrice calculatriceV1 = new Calculatrice();
		
		int resultAddition = calculatriceV1.ajouter(2, 3);
		int resultSoustraction = calculatriceV1.soustraire(6, 4);
		int resultMultiplication = calculatriceV1.multiplier(3, 7);
		//int resultDivision1 = calculatriceV1.diviser(30, 5);
		int resultDivision2 = calculatriceV1.diviser(30, 4);
		
		//Affichage des resultats
		System.out.println("Resultat de l'addition : "+resultAddition);
		System.out.println("Resultat de la soustraction : "+resultSoustraction);
		System.out.println("Resultat de la multiplication : "+resultMultiplication);
		System.out.println("Resultat de la division : "+resultDivision2);
				
	}

}
