package Applet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class stringConcatination extends Applet implements ActionListener
{
        Button find;
        TextField name, addres, t;
        Label nameplate, adds, length;
   
     public void init()     
     {
                nameplate= new Label("Name: ", Label.LEFT);
                name = new TextField(24);
               
                adds= new Label("Address :", Label.RIGHT);                            
                addres = new TextField(50);
               
                length = new Label("length: ", Label.LEFT);
                t= new TextField(50);
             
                find = new Button("FIND");
                
                add(nameplate);
                add(name);
                add(adds);   
                add(addres);
                add(length);
                add(t);
                add(find);
             
                name.addActionListener(this);            
                addres.addActionListener(this);
                find.addActionListener(this);      
     }
       
     public void actionPerformed(ActionEvent ae)    
     {
  
    	 if(ae.getActionCommand().equals("FIND"))             
    		 repaint();
        
     }
        
     public void paint(Graphics g)
     {
    	 int n = name.getText().length();
                
    	 int a = addres.getText().length();
                
    	 int strlen = n+a;
    	/*
    	 *  String s=String.valueOf(strlen);//Conversion from int to string
    	 *  t.setText(s);
    	 */
    	 
    	 t.setText(name.getText() + addres.getText() + "   Str len="+strlen);

     }

}
