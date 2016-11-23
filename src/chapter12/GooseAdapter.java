package chapter12;

/**
 * FileName: GooseAdapter.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
