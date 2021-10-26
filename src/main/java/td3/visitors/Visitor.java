package td3.visitors;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;

public interface Visitor {
    void visit(GroupeClient g);
    void visit(Client c);
    void visit(Commande co);
    void visit(Ligne l);
}
