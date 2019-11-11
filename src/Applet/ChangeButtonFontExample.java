package Applet;/*
        Change Button Font Example
        This java example shows how to change button's font using
        AWT Button class.
*/
 
import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
 
 
/*
<Applet.applet code="Applet.ChangeButtonFontExample" width=200 height=200>
</Applet.applet>
*/
public class ChangeButtonFontExample extends Applet{
 
        public void init(){
               
                //create buttons
                Button button1 = new Button("Button 1");
                Button button2 = new Button("Button 2");
               
                /*
                 * To change font of a button use
                 * setFont(Font f) method.
                 */
               
                Font myFont = new Font("Courier", Font.ITALIC,12);
                button1.setFont(myFont);
 
                //add buttons
                add(button1);
                add(button2);
        }
}