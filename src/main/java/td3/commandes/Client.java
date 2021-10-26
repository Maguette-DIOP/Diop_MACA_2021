package td3.commandes;
import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.Map;
import java.util.TreeMap;

public class Client implements Visitable, PrePostVisitable {
    private String name;
    final Map<String, Commande> commandes ;
    final Map<String, Ligne> lignes;

    public Client(String name) {
        this.name = name;
        this.commandes = new TreeMap<>();
        this.lignes = new TreeMap<>();

    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande co){
        commandes.put(co.getName(),co);
    }
    public void addLigne(Ligne l){
        lignes.put(l.getName(),l);
    }
    @Override
    public void accept(Visitor v) {
        for(Commande c: commandes.values()){
            c.accept(v);
        }
        v.visit(this);
    }

    public void accept(PrePostVisitor p) {
        p.preVisit(this);
        for(Commande l:lignes.values()){
            l.accept(p);
        }
        p.postVisit(this);
    }


}
