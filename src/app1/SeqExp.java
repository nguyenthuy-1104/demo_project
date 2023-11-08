/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

class SeqExp implements Expression {
    private final Expression exp1;
    private final Expression exp2;
    private final int op; // 0 for +, 1 for -, 2 for *, 3 for /

    public SeqExp(Expression e1, Expression e2, int a_op) {
        exp1 = e1;
        exp2 = e2;
        op = a_op;
    }

    @Override
    public int eval() {
        switch (op) {
            case 0 -> {
                return exp1.eval() + exp2.eval();
            }
            case 1 -> {
                return exp1.eval() - exp2.eval();
            }
            case 2 -> {
                return exp1.eval() * exp2.eval();
            }
            case 3 -> {
                if (exp2.eval() == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return exp1.eval() / exp2.eval();
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        }
    }

    public SeqExp operate(Expression e, int a_op) {
        return new SeqExp(this, e, a_op);
    }
}

