package td3.commandes;

import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public class Ligne implements Visitable, PrePostVisitable {
    private int sum;
    private String name;

    public Ligne(int sum) {
        this.sum = sum;
    }

    public Ligne(int sum, String name) {
        this.sum = sum;
        this.name = name;
    }
    public void accept(PrePostVisitor p){

    }

    @Override
    public void accept(Visitor v) {

    }

    public String getName() {
        return name;
    }
}
