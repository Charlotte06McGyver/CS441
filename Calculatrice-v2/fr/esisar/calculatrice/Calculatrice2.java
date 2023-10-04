package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.Operation;

import java.util.HashSet;
import java.util.Set;

public class Calculatrice2 {
	
	private Set<Operation> listeOperation;
	
	public Calculatrice2(HashSet<Operation> operations) {
		this.listeOperation = operations;
	}
	
	public Operation chercherOperation(String nom) {
		
		//Iterateur de la liste d'operation
		for (Operation operation : listeOperation) {
			if(operation.getNom().equals(nom)) {
				return operation;
			}
		}	
		return null;
		
	}

	
	public Double calculer(String nom, Double operande1, Double operande2) throws CalculatriceException{
		
		Operation operation = chercherOperation(nom);
		
		if(operation == null) {
			throw new CalculatriceException ("Operation non valide !");
		}		
		return operation.calculer(operande1, operande2);		
	}
}
