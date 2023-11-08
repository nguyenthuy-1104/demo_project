/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

public class TestExpression {
    public static void main(String args[]) {
        VarExp a = new VarExp();
        VarExp b = new VarExp();
        SeqExp sum = new SeqExp(a, b, 0);
        SeqExp diff = new SeqExp(a, b, 1);
        SeqExp mul = sum.operate(diff, 2);

        a.setValue(3);
        b.setValue(7);

        System.out.println(mul.eval());
    }
}