package tdState;

public abstract class State {
    void abstract allumer(Context c);
    void abstract eteindre(Context c);
    void abstract reparer(Context c);
}
