package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationEnsembliste implements Operation {

	public OperationEnsembliste() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected abstract Double doCalculer(Double[] operandes);


}
