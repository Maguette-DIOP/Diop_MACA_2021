package td3.visitorsImplem;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitors.AbstractVisitor;
import td3.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class PrintRapportCommandes implements Visitor, AbstractVisitor {
    final Map<String, Client> features;
    public PrintRapportCommandes() {
        this.features = new HashMap<>();
    }

    @Override
    public void visit(GroupeClient g) {

    }

    @Override
    public void visit(Client c) {
        features.put(c.getName(),c);

    }

    @Override
    public void visit(Commande co) {

    }

    @Override
    public void visit(Ligne l) {

    }
}
