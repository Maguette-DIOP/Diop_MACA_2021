package tdStrategie;

public class Char extends Unite{
    private int capacité;
    private Attaque combat;

    public Char(Attaque combat) {
        this.capacité = 10;
        this.combat = combat;
    }

}
