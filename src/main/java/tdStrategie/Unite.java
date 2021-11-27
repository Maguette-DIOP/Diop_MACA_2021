package tdStrategie;

public class Unite {
    private Attaque attaque;
    private Deplacement deplacement;

    void seDeplacer(){
        deplacement.deplacer();
    }

    void combattre(){
        attaque.attaquer();
    }
}
