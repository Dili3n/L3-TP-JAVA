package fr.umlv.calc;

public record Value(int nb) implements Expr{

	@Override
	public int eval() {
		return nb;
	}
	
	@Override
	public String toString() {
		return Integer.toString(nb);
	}
	
}
