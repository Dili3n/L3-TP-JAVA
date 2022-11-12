package fr.umlv.calc;

import java.util.Objects;

public record Sub(Expr left, Expr right) implements BinOp {
	
	@Override
	public int op(int e1, int e2) {
		return e1 - e2;
	}
	
	public Sub {
		Objects.requireNonNull(left);
		Objects.requireNonNull(right);
	}
	
	@Override
	public String toString() {
		return "(" + left + " - " + right + ")";
	}
	
	/*@Override
	public int eval() {
		return left.eval() - right.eval();
	}*/
}
	