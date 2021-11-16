package patterns.state;

public class VendingMachineStateBegin extends VendingMachineState {
    private static VendingMachineState instance = null;
    private VendingMachineStateBegin(){}
    public static VendingMachineState getInstance(){
        if(instance == null)
            return new VendingMachineStateBegin();
        return instance;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return 0;
    }
}
