package q5_3;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphView {

    private GraphController controller= new GraphController();
    public  final  Color[] colors = new Color[]{Color.RED, Color.YELLOW, Color.BLUE};

    public GraphView(){
        GraphModel model = new GraphModel();
        JFrame frame  = new JFrame();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        JPanel instructions = new JPanel();
        JLabel instruction = new JLabel("Keep Numbers [1,100]");
        instruction.setHorizontalAlignment(JLabel.LEFT);
        instructions.add(instruction);
        mainPanel.add(instructions);

        for (int x = 0; x < colors.length; x++){
            JPanel row = createRow(colors[x], model.getWidth());
            mainPanel.add(row);
        }

        frame.setSize(700, 200);


        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

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
                        controller.updateBar(text.getText(), icon);
                        row.repaint();
                    }
                }
        );
        row.add(text, BorderLayout.WEST);
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(JLabel.LEFT);
        row.add(label, BorderLayout.CENTER);
        return row;
    }
}