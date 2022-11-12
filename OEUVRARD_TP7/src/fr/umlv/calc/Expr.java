package fr.umlv.calc;

import java.util.Iterator;
import java.util.Scanner;

public sealed interface Expr permits BinOp, Value{

	int eval();
	
	static Expr parse(Iterator<String> iterator) {
		if (! iterator.hasNext()) {
			throw new IllegalStateException("No more op");
		}
		var token = iterator.next();
		return switch(token) {
		case "+" -> new Add(parse(iterator), parse(iterator));
		case "*" -> new Mul(parse(iterator), parse(iterator));
		case "-" -> new Sub(parse(iterator), parse(iterator));
		default -> new Value(Integer.parseInt(token));
		};
	}
	
	static Expr parse(Scanner scan) {
		var token = scan.next();
		return switch(token) {
		case "+" -> new Add(parse(scan), parse(scan));
		case "*" -> new Mul(parse(scan), parse(scan));
		case "-" -> new Sub(parse(scan), parse(scan));
		default -> new Value(Integer.parseInt(token));
		};
	}
	
	@Override
	String toString();
	
}
