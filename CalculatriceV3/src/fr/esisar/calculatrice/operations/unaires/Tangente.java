package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationUnaire;

public class Tangente extends OperationUnaire implements Operation {

	@Override
	public String getNom() {
		return "tan";
	}

	@Override
	protected Double doCalculer(Double operande1) {
		return Math.tan(operande1);
	}

}
