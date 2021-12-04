package api;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int cost(int prix){
        return prix;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + getDescription() + '\'' +
                '}';
    }

}
