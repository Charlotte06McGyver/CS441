package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {
	
	public Operation chercherOperation(String nom) {
		
		return Operation.getNom(nom);
		
	}

	
	public Double calculer(String nom, Double operande1, Double operande2) {
		
	}
}
