package duck;

import duck.behavior.FlyNoWay;
import duck.behavior.fakeQuack;

public class DuckCall extends Duck {

    public DuckCall() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new fakeQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a duck call");
    }
}
