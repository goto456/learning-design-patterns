package Factory;

/**
 * Created by goto456 on 2018/11/5.
 */
public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new Product1();
        } else if (type == 2) {
            return new Product2();
        } else {
            return new Product3();
        }
    }

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product1 = factory.createProduct(1);
        // do something
    }
}

