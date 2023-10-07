package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste implements Operation {

	@Override
	public String getNom() {
		return "max";
	}

	@Override
	protected Double doCalculer(Double[] operandes) {
		Double maximum = operandes[0];
		for (Double operande : operandes) {
			if (operande>maximum) {
				maximum = operande;
			}
		}
		return maximum;
	}

}
