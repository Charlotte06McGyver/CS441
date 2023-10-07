package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {
	
	private Set<Operation> listeOperation;
	
	public Calculatrice() {
		listeOperation = new HashSet<Operation>();
	}
	
	public Calculatrice(Set<Operation> operations) {
		listeOperation = operations;
	}
	
	public void ajouterOperation(Operation operation) {
		if (!listeOperation.contains(operation)) {
			listeOperation.add(operation);
		}
	}
	
	public void retirerOperation(Operation operation) {
		listeOperation.remove(operation);
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

	public Double calculer(String nom, Double ... operandes) throws CalculatriceException{
		
		Operation operation = chercherOperation(nom);
		
		if(operation == null) {
			throw new CalculatriceException ("Operation inexistante dans la calculatrice !");
		}		
		
		return operation.calculer(operandes);	
	}
}
