package q5_4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Dictionary;

public class ColorController implements ChangeListener {
    JSlider slider;
    String color;
    ColorModel colorModel;

    public ColorController(JSlider slider, String color, ColorModel model){
        this.slider = slider;
        this.color = color;
        colorModel = model;
    }

    public void stateChanged(ChangeEvent e) {
        System.out.println(color + ":" + slider.getValue());
        colorModel.updateColor(color, slider.getValue());
    }
}
