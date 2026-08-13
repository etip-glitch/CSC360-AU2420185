import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 200); // x, y, width, height (all equal = square)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Square());
        frame.setVisible(true);
    }
}