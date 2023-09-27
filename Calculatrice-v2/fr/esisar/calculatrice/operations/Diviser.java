package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public class Diviser implements Operation {

	@Override
	public String getNom() {
		return "/";
	}

	@Override
	public Double calculer(Double operande1, Double operande2) throws CalculatriceException{
		if (operande2==0) {
			throw new CalculatriceException("Division par 0 impossible !");
		}
		else {
			return operande1/operande2;
		}
	}

}
