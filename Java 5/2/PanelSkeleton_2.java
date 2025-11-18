import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class PanelSkeleton_2 extends JPanel
{

    // int size_x, size_y;
    // int position_x, position_y;

    public void paintComponent(Graphics g)
    {
        // Code goes here!!
        Random r = new Random();
        int x = r.nextInt(300);
        int y = r.nextInt(300);
        int width = r.nextInt(100, 200);
        int height = r.nextInt(100, 200);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
    // public static void generateShape() {

    // }
}