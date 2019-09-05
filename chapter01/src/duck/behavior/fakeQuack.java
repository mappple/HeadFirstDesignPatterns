package duck.behavior;

public class fakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm a duck call");
    }
}
