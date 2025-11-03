import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelSkeleton_3 extends JPanel {
    public void paintComponent(Graphics g) {
        Scanner s = new Scanner(System.in);
        g.setColor(Color.black);
        g.drawString("make ur own shape yay", 0, 0);
        System.out.print("Define x: ");
        int x = s.nextInt();
        System.out.print("Define y: ");
        int y = s.nextInt();
        System.out.print("Define width: ");
        int width = s.nextInt();
        System.out.print("Define height: ");
        int height = s.nextInt();
        g.fillOval(x, y, width, height);
    }
}