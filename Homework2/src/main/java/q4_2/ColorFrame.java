package q4_2;


import q4_1.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame  {
    private final int size = 5;
    Color color;
    JLabel jLabel;
    JFrame jFrame;
    ColorIcon icon;

    public ColorFrame(){
        jLabel = new JLabel();
        icon = new ColorIcon();
        jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jLabel = new JLabel(icon);

    }

    public JButton createButton(String name){
        JButton button = new JButton(name);
        button.addActionListener(createColorChangeActionListener(name, this));
        return button;
    }

    public void setColor(String colorName){
        switch (colorName.toLowerCase()){
            case "red":
                color = Color.RED;
                break;
            case "blue":
                color = Color.BLUE;
                break;
            case "green":
                color = Color.GREEN;
                break;
            default:
                color = Color.white;
        }
        icon.setIconColor(color);
    }

    public static ActionListener createColorChangeActionListener(final String name, ColorFrame frame)  {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(name);
                frame.setColor(name);
                frame.jLabel.repaint();
            }
        };
    };


    public static void main(String[] args) throws Exception {
        ColorFrame colorFrame = new ColorFrame();

        String[] colors = new String[] {"RED","GREEN","BLUE"};
        JButton[] buttons = new JButton[3];

        for (int x = 0 ; x < colors.length; x++){
            buttons[x] = colorFrame.createButton(colors[x]);
            colorFrame.color = (Color) Color.class.getField(colors[x]).get(null);

            colorFrame.jFrame.add(buttons[x]);
        }
        colorFrame.jFrame.add(colorFrame.jLabel);
        colorFrame.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorFrame.jFrame.pack();
        colorFrame.jFrame.setVisible(true);

    }
}
