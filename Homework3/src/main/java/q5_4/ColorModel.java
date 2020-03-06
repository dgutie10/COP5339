package q5_4;

import java.awt.*;
import java.util.HashMap;

public class ColorModel {
    private  int sliderMax = 255;
    private int sliderMin= 0;
    private int sliderInit = 0;
    private HashMap<String, Integer> colors;
    private ColorView view;

    public  ColorModel(ColorView view){
        colors = new HashMap<>();
        colors.put("Red", sliderInit);
        colors.put("Green", sliderInit);
        colors.put("Blue", sliderInit);
        this.view = view;
    }

    public void updateColor(String color, int value){
        colors.put(color, value);
        Color newColor = new Color(
                colors.get("Red"),
                colors.get("Green"),
                colors.get("Blue")
        );
        view.updateIconColor(newColor);

    }

    public int getSliderMax() { return sliderMax; }

    public int getSliderMin() { return sliderMin; }

    public HashMap<String, Integer> getColors(){ return colors; }

}
