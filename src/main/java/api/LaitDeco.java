package api;

public class LaitDeco extends DecorateurBeverage{
    public LaitDeco(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"blabla";
    }

    @Override
    public int cost(int prix) {
        return beverage.cost(prix);
    }
}
