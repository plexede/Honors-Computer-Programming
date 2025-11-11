import javax.swing.*;
import java.awt.*;

public class PanelSkeleton_1 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // Code goes here!!
        int center = 500 / 4;
        int faceDiameter = 200;
        g.setColor(Color.yellow);
        g.fillOval(center, center, faceDiameter, faceDiameter);
        g.setColor(Color.black);
        g.fillOval(center + 40, center + 50, 20, 30);
        g.fillOval(center + 120, center + 50, 20, 30);
        // g.setColor(Color.brown);
        // g.fillOval();
        
    }
}