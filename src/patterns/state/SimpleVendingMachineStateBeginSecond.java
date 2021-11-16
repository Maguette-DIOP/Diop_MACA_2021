package patterns.state;

public class SimpleVendingMachineStateBeginSecond extends SimpleVendingMachineState{

    public static SimpleVendingMachineState instance = null;
    private SimpleVendingMachineStateBeginSecond(){}

    public static SimpleVendingMachineState getInstance(){
        if(instance == null){
            return new SimpleVendingMachineStateBeginSecond();
        }
        return instance;
    }
    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {

    }

}
