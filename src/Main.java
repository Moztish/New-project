import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("name title");
        frame.add(new HelloComponent("text inside"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent implements MouseMotionListener {
    private final String message;
    private int messageX = 125;
    private int messageY = 95;

    public HelloComponent(String message) {
        this.message = message;
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, messageX, messageY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
