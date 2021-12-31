package tdState;

public class Context {
    public static final MAX_USAGES=2;
    private int usages;
    private State state;
    public void goNext(){

    }

    public void setState(State s){
        this.state = s;
    }

    int usages(){
        return usages;
    }
    void razUsage(){ usages = 0;}
    void augmenterUsages(){usages++;}
    public void allumer(){this.state.allumer(this);}
    public void eteindre(){this.state.eteindre(this);}
    public void reparer(){this.state.reparer(this);}

}
