import javax.swing.*;
import java.awt.*;

/**
 * Created by kuwu on 2017/06/22.
 */
public class Draw extends JComponent{

    public static void main (String[] args){

        // code for creating drawing window
        JFrame window = new JFrame("Drawing Fun");
        window.add(new Draw());
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }

    // giving the window a size
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    //drawing two quadrilaterals
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0x86BED8));
        g.fillRect(0, 0, 800, 600);

        g.setColor(new Color(207, 161, 210));
        g.fillPolygon( new int[] {20, 20, 60, 60}, new int[] {20, 70, 90, 40}, 4);

        g.setColor(new Color(210, 84, 185));
        g.fillPolygon( new int[] {20, 70, 110, 60}, new int[] {20, -20, 0, 40}, 4);

    }


}
