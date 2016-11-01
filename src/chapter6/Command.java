package chapter6;

/**
 * FileName: Command.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-24
 */
public interface Command {
    public void execute();

    public void undo();
}
