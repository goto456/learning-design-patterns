package chapter12;

/**
 * FileName: DuckSimulator.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallardDucks = new Flock();
        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        flockOfMallardDucks.add(mallardDuckOne);
        flockOfMallardDucks.add(mallardDuckTwo);
        flockOfMallardDucks.add(mallardDuckThree);
        flockOfMallardDucks.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallardDucks);

        System.out.println("\nDuckSimulator");

//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
        simulate(flockOfDucks);

        System.out.println("\nMallardDucks");
        simulate(flockOfMallardDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
