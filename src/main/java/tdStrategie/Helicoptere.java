package tdStrategie;

public class Helicoptere extends Unite{
    private int capacité;
    private Attaque combat;

    public Helicoptere(Attaque combat) {
        this.capacité = 10;
        this.combat = combat;
    }
}
