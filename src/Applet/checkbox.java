package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class checkbox extends Applet implements ItemListener {
	Checkbox c1,c2,c3;
	String s="",s2,s3,s1;
	TextField t1,t2,t3;
	
	 public void init()
	 	    {
	    	
	    	c1=new Checkbox("red",null,false);
	    	c2=new Checkbox("blue",null,false);
	    	c3=new Checkbox("green",null,false);
	    	t1=new TextField(20);
	    	t2=new TextField(20);
	    	t3=new TextField(20);
	    	add(c1);
	    	add(c2);
	    	add(c3);
	    	add(t1);
	    	add(t2);
	    	add(t3);
	    	
	    	c1.addItemListener(this);
	    	c2.addItemListener(this);
	    	//c3.addItemListener(this);
	    	c3.addItemListener(this);
	    	
	    }
	 public void itemStateChanged(ItemEvent ie)
	    {
		 repaint();
		 /*if(c1.getState()) 
		 {
			 s=c1.getLabel();
			 //t1.setText(s);
			 repaint();
		 }
		 else if(c2.getState())
		 {
			 s=c2.getLabel();
			 //t2.setText(s);
			 repaint();
		 }
		 else if 
		 (c3.getState())
		 {
			 s=c3.getLabel();
			 //t3.setText(s);
			 repaint();
		 }
		 else
			 {
			  s="";
			  repaint();
			 }*/
	 }
	 public void paint(Graphics g)
	    {
		 if(c1.getState()) 
		 {
			 s1=c1.getLabel();
			 t1.setText(s1);// repaint();
		 }
		 else
			 t1.setText(s);
		 
		 
		 
        if(c2.getState())
		 {
			 s2=c2.getLabel();
			 t2.setText(s2);// repaint();
		 }
        	else
   			 t2.setText(s);
        
        
        
		  if (c3.getState())
		 {
			 s3=c3.getLabel();
			 t3.setText(s3);//repaint();
		 }
		  else
				 t3.setText(s);
		
	    	//g.drawString(s,100,100);
	    	//t1.setText(s);
		 
	    }
}
	 
	 
	 
