package chapter11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * FileName: ImageIcon.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-22
 */
public class ImageIcon implements Icon {
    private URL imageURL;
    private String name;

    public ImageIcon(URL imageURL, String name) {
        this.imageURL = imageURL;
        this.name = name;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
