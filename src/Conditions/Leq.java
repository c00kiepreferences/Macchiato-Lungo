package Conditions;

import Expressions.Exp;
import Expressions.Minus;

public class Leq extends Condition {
    public Leq(Exp exp1, Exp exp2) {
        super(exp1, exp2);
        symbol = "<=";
    }

    public static Leq of(Exp a, Exp b) {
        return new Leq(a, b);
    }

    public boolean outcome() {
        return exp1.count() <= exp2.count();
    }
}
