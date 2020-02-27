package q4_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ColorIcon implements Icon {
    private  int size = 50;
    Graphics2D g2;
    Color color = Color.WHITE;

    public void setIconColor(Color color){
        this.color = color;
        g2.setColor(this.color);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g2 = (Graphics2D) g;
        Ellipse2D.Double icon = new Ellipse2D.Double(x, y, size, size);
        setIconColor(color);
        g2.fill(icon);

    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }
}
