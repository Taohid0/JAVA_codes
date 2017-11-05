package applet_practice;

import java.applet.Applet;
import java.awt.Graphics;

public class Hello extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 25);
    }
}