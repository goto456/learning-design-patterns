package Factory;

/**
 * Created by goto456 on 2018/11/5.
 */
public abstract class AbstractFactory {
    abstract ProductA createProductA();
    abstract ProductB createProductB();

}

class NewFactory1 extends AbstractFactory {

    @Override
    ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ProductB1();
    }
}

class NewFactory2 extends AbstractFactory {

    @Override
    ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ProductB2();
    }
}


