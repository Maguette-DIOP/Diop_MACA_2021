package api;

public class MochaDeco extends DecorateurBeverage{
    public MochaDeco(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"jsp";
    }

    @Override
    public int cost(int prix) {
        return beverage.cost(prix);
    }
}
