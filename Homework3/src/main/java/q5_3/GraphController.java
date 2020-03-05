package q5_3;

import javax.swing.*;
import java.awt.*;

public class GraphController {
    private int maxWidth = 500;

    public void updateBar(String perc, GraphIcon icon){
        int newWidth = 0;
        try{
            newWidth = Integer.parseInt(perc);
            float p = (int) newWidth;
            if (newWidth <= 100) {
                p = (p / 100);
                newWidth = (int) (p * maxWidth);
            }else {
                newWidth = maxWidth;
            }
            icon.setWidth(newWidth);

        }catch (Exception e){
           icon.setWidth(0);
        }
    }

}
