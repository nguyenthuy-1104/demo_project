/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

class VarExp implements Expression {
    private int var;

    public VarExp() {
        this.var = 0; // Initialize the variable to 0 by default
    }

    public void setValue(int n) {
        this.var = n;
    }

    @Override
    public int eval() {
        return var;
    }
}
