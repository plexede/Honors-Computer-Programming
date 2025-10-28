import javax.swing.*;
import java.awt.*;

public class PanelSkeleton extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // Code goes here!!
        g.setColor(Color.BLUE);
        g.drawRect(10, 20, 100, 50);
    }
}