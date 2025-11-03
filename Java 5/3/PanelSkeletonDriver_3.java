import javax.swing.*;
import java.awt.*;

public class PanelSkeletonDriver_3 {
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setContentPane(new PanelSkeleton_1());
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
    }
}
