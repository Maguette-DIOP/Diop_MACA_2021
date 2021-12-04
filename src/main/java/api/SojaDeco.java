package api;

public class SojaDeco extends DecorateurBeverage{
    public SojaDeco(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"soja";
    }

    @Override
    public int cost(int prix) {
        return beverage.cost(prix);
    }
}
