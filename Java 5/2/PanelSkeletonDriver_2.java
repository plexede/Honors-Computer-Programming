import javax.swing.*;
import java.awt.*;

public class PanelSkeletonDriver_2 {
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setContentPane(new PanelSkeleton_3());
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
    }
}
