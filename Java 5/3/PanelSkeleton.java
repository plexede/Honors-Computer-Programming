import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelSkeleton extends JPanel
{
    public void paintComponent(Graphics g)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Define x: ");
        int x = scanner.nextInt();
        System.out.print("Define y: ");
        int y = scanner.nextInt();
        System.out.print("Define z: ");
        int z = scanner.nextInt();
        System.out.print("Define width: ");
        int width = scanner.nextInt();
        System.out.print("Define height: ");
        int height = scanner.nextInt();
        // Code goes here!!
        g.setColor(Color.BLUE);
        g.drawRect(10, 20, 100, 50);
    }
}