package q5_4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class ColorView {

    private  ColorModel model;
    private JFrame frame;
    ColorIcon icon;

    public ColorView() {
        model = new ColorModel(this);
        frame  = new JFrame();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        icon = new ColorIcon();
        JLabel iconLabel =new JLabel(icon);
        panel.add(iconLabel);
        mainPanel.add(panel, BorderLayout.CENTER);

        JPanel sliders = new JPanel();
        sliders.setLayout(new GridLayout(3,1));
        model.getColors().forEach((color, value) ->{
            JPanel row = createRow(color, value);
            sliders.add(row);
        });
        mainPanel.add(sliders);

        frame.setSize(700, 700);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    public JPanel createRow(String color, int value){
        JPanel row = new JPanel();
        ColorController controller;
        row.setPreferredSize(new Dimension(700, 20));
        row.setBorder(new EmptyBorder(6,6,6,6));
        row.setLayout(new BorderLayout());
        JSlider slider = new JSlider(JSlider.HORIZONTAL,model.getSliderMin(),model.getSliderMax(),value);
        controller = new ColorController(slider, color, model);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(15);
        slider.addChangeListener(controller);
        row.add(slider, BorderLayout.CENTER);
        JLabel label = new JLabel(color);
        label.setHorizontalAlignment(JLabel.LEFT);
        row.add(label, BorderLayout.WEST);
        return row;
    }

    public void updateIconColor(Color color){
        icon.setIconColor(color);
        frame.repaint();
    }
}
