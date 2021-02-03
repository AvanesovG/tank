package display;

import javax.swing.*;
import java.awt.*;

public abstract class Display {


    private static boolean created = false;
    private static JFrame windows;
    private static Canvas content;


    public static void create(int width, int height, String title) {

        if (created)
            return;

        windows = new JFrame(title);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas();
        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);
        windows.setResizable(false);
        windows.getContentPane()
                .add(content);

        windows.pack();
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);

    }


}
