package api;

public abstract class DecorateurBeverage extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
    public abstract int cost(int prix);

}
