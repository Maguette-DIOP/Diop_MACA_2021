package tdStrategie;

public class Soldat extends Unite{
    private Attaque attaque;
    private int capacite;

    public Soldat(Attaque attaque) {
        this.attaque = attaque;
        this.capacite = 10;
    }
}
