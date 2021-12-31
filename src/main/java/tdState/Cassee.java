package tdState;

public abstract class Cassee extends State{
    private String info = "cassee";
    @Override
    public void allumer(Context c) {
        System.out.println(info);
    }

    @Override
    public void eteindre( Context c) {
        System.out.println(info);
    }

    public void reparer(Context c){
        System.out.println(info);
        c.razUsage();
        c.setState(Eteinte.instance());
        System.out.println("");
    }
}
