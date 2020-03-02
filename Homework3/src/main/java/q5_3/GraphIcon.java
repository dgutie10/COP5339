package q5_3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GraphIcon implements Icon {
    int heigth = 50;
    int width;
    Color color;

    GraphIcon(Color color, int width){
        this.width = width;
        this.color = color;
    }

    public void setWidth(int width){ this.width = width; }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double icon =  new Rectangle2D.Double(x,y, width, heigth);
        g2.setColor(this.color);
        g2.fill(icon);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return heigth;
    }
}
