package tdState;

public abstract class Eteinte extends State{

//singleton avec state
    @Override
    public void allumer(Context c) {
        if(c.usage()+1 > Context.MAX_USAGES){
            c.setState(Cassee.instance);
            System.out.println("ampoule casse")
        }
        else{
            c.setState(Allumee.instance);
            c.augmenterUsage();
            System.out.println("allumer");
        }

    }

    @Override
    public void eteindre(Context c) {
        System.out.println("deja eteinte");//si c'est on dans allumer on fait parail dans la méthode et reperer c'est impossible
    }

    @Override
    public void reparer(Context c){
        c.razUsage();
    }
}
