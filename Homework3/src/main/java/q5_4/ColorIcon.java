package q5_4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ColorIcon implements Icon {
    int size = 200;
    Graphics2D g2;
    private Color color = new Color(0,0,0);

    public void setIconColor(Color color){
        this.color = color;
        g2.setColor(this.color);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g2 = (Graphics2D) g;
        Ellipse2D.Double icon = new Ellipse2D.Double(x, y, size, size);
        g2.setColor(this.color);
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
