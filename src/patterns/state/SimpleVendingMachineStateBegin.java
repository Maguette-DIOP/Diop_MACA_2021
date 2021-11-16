package patterns.state;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState {
    private static SimpleVendingMachineState instance = null;

    private SimpleVendingMachineStateBegin(){}

    public static SimpleVendingMachineState getInstance(){
        if(instance == null)
            return new SimpleVendingMachineStateBegin();

        return instance;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        if(c.getCaisse()+money<10){
            c.setCaisse(c.getCaisse()+money);
            c.setState(SimpleVendingMachineStateBegin.getInstance());
        }
        else{

        }
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {

    }
}
