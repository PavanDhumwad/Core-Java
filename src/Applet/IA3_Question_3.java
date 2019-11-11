package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class IA3_Question_3 extends Applet implements ActionListener,ItemListener{
	                                      
	CheckboxGroup cbg;
	Checkbox c1,c2,c3;
    Button b1;
    Label l1;
    TextField t1;
    String s="";
    public void init()
    {
    	cbg=new CheckboxGroup();
    	c1=new Checkbox("red",cbg,false);
    	c1.addItemListener(this);
    	add(c1);

    	c2=new Checkbox("blue",cbg,false);
    	c2.addItemListener(this);
    	add(c2);
    	
    	
    	c3=new Checkbox("green",cbg,false);
    	c3.addItemListener(this);
    	add(c3);
    	
    	
    	b1=new Button("GO");
    	l1=new Label("Color",Label.LEFT);
    	t1=new TextField(20);
    	
       //	add(c2);
    	//add(c3);
    	add(l1);
    	add(b1);
    	add(t1);
    	
    	//c2.addItemListener(this);
    	//c3.addItemListener(this);
    	b1.addActionListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
    	//Checkbox cb=(Checkbox)ie.getSelectedCheckbox().getLabel();
    	s=cbg.getSelectedCheckbox().getLabel();
    	//showStatus(cb.getLabel());
    	
    	//repaint();Selected
    	
    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getActionCommand().compareTo("GO")==0)
    		setBackground(Color.black);
    	repaint();
    }
    public void paint(Graphics g)
    {
    	//g.drawString(s,100,100);
    	t1.setText(s);
    }
}

