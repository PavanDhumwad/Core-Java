package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DrawGeoFigUsingApplet extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2,b3;
	
	int rect=0,tri=0,c=0;
	
	public void init()       
	{
		t1 = new TextField(24);
		t2 = new TextField(24);
		t3 = new TextField(24);
		
		b1 = new Button("Rectangle");
		b2 = new Button("Triangle");
		b3 = new Button("Circle");
		
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Rectangle"))
		{
			rect=1;
			repaint();
		}
		else if(ae.getActionCommand().equals("Triangle"))
		{
			tri=1;
			repaint();
		}
		
		else if(ae.getActionCommand().equals("Circle"))
		{
			c=1;
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		int var1 = Integer.parseInt(t1.getText());
		int var2 = Integer.parseInt(t2.getText());
		int var3 = Integer.parseInt(t3.getText());
		
		if(rect==1)
		{
			
			g.drawRect(120, 120, var1, var2);
			rect = 0;
		}
		else if(tri==1)
		{
			g.drawLine(var1, var2, 150, 150);
			g.drawLine(var2, var3, 150, 150);
			g.drawLine(var1, var2, var2, var3);
			tri = 0;
		}
		else if(c==1)
		{
			g.drawOval(120, 120, var1, var1);
			c = 0;
		}
		
	}
	
}
