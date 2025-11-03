import javax.swing.*;
import java.awt.*;

public class PanelSkeletonDriver_1 {
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setContentPane(new PanelSkeleton_2());
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
    }
}
