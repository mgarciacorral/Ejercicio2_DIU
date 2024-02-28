import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;
public class FormaGeneralCasitas extends JPanel {
    public void paintComponent(Graphics g) {
        Random random = new Random();
        int x[] = {30, 0, 0, 25, 25, 35, 35, 60, 60};
        int y[] = {0, 20, 40, 40, 30, 30, 40, 40, 20};
        Graphics2D g2 = (Graphics2D) g;
        GeneralPath casita = new GeneralPath();
        casita.moveTo(x[0], y[0]);

        for (int i = 1; i < x.length; i++)
        {
            casita.lineTo(x[i], y[i]);
        }
        casita.closePath();

        g2.translate(150, 65);
        g2.scale(1.5, 1.5);

        for (int i = 1; i <= 6; i++)
        {
            g2.translate(32, 32);
            g2.rotate(Math.PI / 3.0);
            g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g2.fill(casita);
        }
    }
}