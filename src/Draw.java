import javax.swing.*;
import java.awt.*;

/*************************************************************************
        *
        * FILE:    DrawGraphics.java
        *
        * PURPOSE: This program is part of an ongoing process to explore shape, color
        *          and movement. The result will be output in a desktop window.
        *
        *
        * (C) 2017, Kurt Wunderlich
        *
        * --
        * Permission is hereby granted, free of charge, to any person obtaining
        * a copy of this software and associated documentation files (the
        * "Software"), to deal in the Software without restriction, including
        * without limitation the rights to use, copy, modify, merge, publish,
        * distribute, sublicense, and/or sell copies of the Software, and to
        * permit persons to whom the Software is furnished to do so, subject to
        * the following conditions:
        *
        * The above copyright notice and this permission notice shall be
        * included in all copies or substantial portions of the Software.
        *
        * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
        * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
        * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
        * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
        * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
        * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
        * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
        *
        *  DATE           AUTHOR        DESCRIPTION
        *  ------------  ----------     ---------------------------------------
        *  2017-jun-22    kuwu          Initial Creation
        *************************************************************************/




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

        Graphics2D g2d = (Graphics2D) g;


        g.setColor(new Color(102, 164, 210));
        g2d.fill(new Rectangle(0, 0, 800, 600));

        //g.setColor(new Color(207, 161, 210));
        g.setColor(Color.BLACK);

        g2d.draw(new Polygon( new int[] {20, 20, 60, 60}, new int[] {20, 70, 90, 40}, 4));
        g.setColor(new Color(207, 161, 210));
        g2d.fill( new Polygon( new int[] {20, 20, 60, 60}, new int[] {20, 70, 90, 40}, 4));

        g.setColor(new Color(210, 84, 185));

        g2d.fill(new Polygon( new int[] {20, 70, 110, 60}, new int[] {20, -20, 0, 40}, 4));

    }


}
