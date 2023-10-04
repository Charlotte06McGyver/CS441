package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Multiplier extends OperationBinaire {

	public Multiplier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1*operande2;
	}

}
