package fr.umlv.calc.main;

import java.util.List;
import java.util.Scanner;

import fr.umlv.calc.*;

public class Main {
	
  public static void main(String[] args) {
    Expr expression = new Add(new Value(2), new Value(3));
    Expr expression2 = new Sub(new Mul(new Value(2), new Value(3)), new Value(4));
    System.out.println(expression2.eval());
    var list = List.of("-", "*", "2", "3", "4");
    Expr e = Expr.parse(list.iterator());
    System.out.println(e);
    System.out.println(e.eval());
    System.out.println(expression2);
  }

}
