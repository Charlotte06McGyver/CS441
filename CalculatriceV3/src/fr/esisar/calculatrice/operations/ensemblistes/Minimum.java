package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste implements Operation {

	@Override
	public String getNom() {
		return "min";
	}

	@Override
	protected Double doCalculer(Double[] operandes) {
		Double minimum = operandes[0];
		for (Double operande : operandes) {
			if (operande<minimum) {
				minimum = operande;
			}
		}
		return minimum;
	}

}
