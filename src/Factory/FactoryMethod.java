package Factory;

/**
 * Created by goto456 on 2018/11/5.
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        factory1.doSomething();

        Factory factory2 = new Factory2();
        factory2.doSomething();

        Factory factory3 = new Factory3();
        factory3.doSomething();
    }
}

abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something
    }
}

class Factory1 extends Factory {

    @Override
    public Product factoryMethod() {
        return new Product1();
    }
}

class Factory2 extends Factory {

    @Override
    public Product factoryMethod() {
        return new Product2();
    }
}

class Factory3 extends Factory {

    @Override
    public Product factoryMethod() {
        return new Product3();
    }
}