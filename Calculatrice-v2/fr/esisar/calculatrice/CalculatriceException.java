package fr.esisar.calculatrice;

public class CalculatriceException extends Exception{
	
	private final String message;
	
	public CalculatriceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "CalculatriceException [message=" + message + "]";
	}

}
