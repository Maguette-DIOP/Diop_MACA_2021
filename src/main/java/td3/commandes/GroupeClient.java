package td3.commandes;

import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.*;

public class GroupeClient implements Visitable, PrePostVisitable {
    private String name;
    List<Client> clients;
    //final Map<String,Commande> maMapc = new HashMap<>();
    final Map<String, Commande> maMapc;

    public GroupeClient(String name) {
        this.clients = new ArrayList<>();
        this.name = name;
        this.maMapc = new TreeMap<>();
    }
    public void addClient(Client c){
        clients.add(c);
    }
    public void addCommande(String name, Commande c){
        maMapc.put(name,c);
    }
    public void addLigne(String name, String s, Ligne l){

    }
    public void accept(PrePostVisitor p){

    }

    @Override
    public void accept(Visitor v) {

    }
}
