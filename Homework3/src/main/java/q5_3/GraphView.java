package q5_3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphView {

    private  int width = 100;
    private int maxWidth = 500;
    public  final  Color[] colors = new Color[]{Color.RED, Color.YELLOW, Color.BLUE};

    public JPanel createRow(Color color, int width){
        JPanel row = new JPanel();
        row.setBorder(new EmptyBorder(6,6,6,6));
        row.setLayout(new BorderLayout());
        JTextField text = new JTextField(5);
        GraphIcon icon = new GraphIcon(color, width);
        text.addKeyListener(
                new KeyListener() {
                    public void keyTyped(KeyEvent e) {}
                    public void keyPressed(KeyEvent e) {}
                    public void keyReleased(KeyEvent e) {
                        updateBar(text.getText(), icon);
                        row.repaint();
                    }
                }
        );
        row.add(text, BorderLayout.WEST);
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(JLabel.LEFT);
        row.add(label, BorderLayout.CENTER);
//        row.addKeyListener(this);
        return row;
    }

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


    public static void main(String[] args) {
        GraphView graphTest = new GraphView();
        JFrame frame  = new JFrame();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        JPanel instructions = new JPanel();
        instructions.add(new JLabel("Keep Numbers [1,100]"));
        mainPanel.add(instructions);

        for (int x = 0; x < graphTest.colors.length; x++){
            JPanel row = graphTest.createRow(graphTest.colors[x], graphTest.width);
            mainPanel.add(row);
        }



//        JPanel row1 = new JPanel();
//        row1.setBorder(new EmptyBorder(6,6,6,6));
//        row1.setLayout(new BorderLayout());
//        row1.add(new JTextField(5), BorderLayout.WEST);
//        JLabel label1 = new JLabel(new GraphIcon(Color.RED));
//        label1.setHorizontalAlignment(JLabel.LEFT);
//        row1.add(label1, BorderLayout.CENTER);


//        JPanel row2 = new JPanel();
//        row2.setBorder(new EmptyBorder(6,6,6,6));
//        row2.setLayout(new BorderLayout());
//        row2.add(new JTextField(5), BorderLayout.WEST);
//        JLabel label2 = new JLabel(new GraphIcon(Color.YELLOW));
//        label2.setHorizontalAlignment(JLabel.LEFT);
//        row2.add(label2, BorderLayout.CENTER);
//
//
//        JPanel row3 = new JPanel();
//        row3.setBorder(new EmptyBorder(6,6,6,6));
//        row3.setLayout(new BorderLayout());
//        row3.add(new JTextField(5), BorderLayout.WEST);
//        JLabel label3 = new JLabel(new GraphIcon(Color.BLUE));
//        label3.setHorizontalAlignment(JLabel.LEFT);
//        row3.add(label3, BorderLayout.CENTER);

        frame.setSize(700, 200);
//        mainPanel.add(row1);
//        mainPanel.add(row2);
//        mainPanel.add(row3);

        frame.add(mainPanel);
        System.out.println("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}