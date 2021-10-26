package td3.commandes;

import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public class Commande implements Visitable, PrePostVisitable {
    private String name;

    public Commande(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
    }
    public void accept(PrePostVisitor p) {
    }

}
