import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("Dibujando Casitas");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                FormaGeneralCasitas fg = new FormaGeneralCasitas();
                frame.add(fg);
                frame.setBackground(Color.WHITE);
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}