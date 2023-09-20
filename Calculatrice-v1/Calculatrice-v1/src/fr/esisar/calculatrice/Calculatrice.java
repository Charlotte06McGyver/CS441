package fr.esisar.calculatrice;

/**
 * Classe d'une calculatrice
 * @author Charlotte Casarrubios
 * @version 1.0
 */

public class Calculatrice {
	
	/**
	 * Effectue l'addition de deux opérandes
	 * @param operande1     Premier opérande
	 * @param operande2     Deuxième opérande
	 * @return 
	 */
	public Integer ajouter(Integer operande1, Integer operande2) {
		return operande1 + operande2;
	}
	
	/**
	 * Effectue la soustraction de deux opérandes
	 * @param operande1
	 * @param operande2
	 * @return
	 */
	public Integer soustraire(Integer operande1, Integer operande2) {
		return operande1 - operande2;
	}
	
	/**
	 * Effectue la multiplication de deux opérandes
	 * @param operande1
	 * @param operande2
	 * @return
	 */
	public Integer multiplier(Integer operande1, Integer operande2) {
		return operande1 * operande2;

	}
	
	/**
	 * Effectue la division de deux opérandes
	 * @param operande1
	 * @param operande2
	 * @return
	 */
	public Integer diviser(Integer operande1, Integer operande2) {
		return operande1 / operande2; //division entiere
	}

}
