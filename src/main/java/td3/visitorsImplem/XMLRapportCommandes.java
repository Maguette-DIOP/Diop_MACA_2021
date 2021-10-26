package td3.visitorsImplem;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitable.PrePostVisitable;
import td3.visitors.AbstractVisitor;
import td3.visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor, AbstractVisitor {

    @Override
    public void preVisit(GroupeClient g) {

    }

    @Override
    public void preVisit(Client c) {

    }

    @Override
    public void preVisit(Commande co) {

    }

    @Override
    public void preVisit(Ligne l) {

    }

    @Override
    public void postVisit(GroupeClient g) {

    }

    @Override
    public void postVisit(Client c) {

    }

    @Override
    public void postVisit(Commande co) {

    }

    @Override
    public void postVisit(Ligne l) {

    }
}
