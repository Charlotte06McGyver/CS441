package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Ajouter extends OperationBinaire {

	public Ajouter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1+operande2;
	}

}
