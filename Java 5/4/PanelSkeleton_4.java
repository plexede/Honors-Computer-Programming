import javax.swing.*;
import java.awt.*;

public class PanelSkeleton_4 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // Code goes here!!
        g.setColor(Color.BLUE);
        g.fillArc(250, 250, 100, 200, (int)(Math.random() * 360), (int)(Math.random() * 360));
    }
}