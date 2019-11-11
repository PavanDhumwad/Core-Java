package Applet;

import java.awt.*;
import java.applet.*;
public class applet extends Applet {
public void paint(Graphics g)
{
	g.drawRect(50,50,200,50);
	setForeground(Color.red);
    g.fillRoundRect(55,55,20,20,5,5);
    setBackground(Color.yellow);
    g.fillRoundRect(70,70,20,20,5,5);
}
}
