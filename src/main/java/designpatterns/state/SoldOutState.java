package designpatterns.state;

/**
 * Created by zhangyue-k on 2018/1/21.
 */
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("We turned, but there are no gumball");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
