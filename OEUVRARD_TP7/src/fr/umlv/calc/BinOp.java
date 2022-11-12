package fr.umlv.calc;

public sealed interface BinOp extends Expr permits Add, Sub, Mul {
  int op(int e1, int e2);

  default int eval() {
    return op(left().eval(), right().eval());
  }

  Expr left();
  Expr right();
}