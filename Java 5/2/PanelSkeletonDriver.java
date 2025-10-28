import javax.swing.*;
import java.awt.*;

public class PanelSkeletonDriver {
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setContentPane(new PanelSkeleton());
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
    }
}
