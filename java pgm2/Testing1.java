import java.awt.*;
import java.applet.*;
public class Testing1 extends Applet throws IOException
{
public void paint(Graphics g)
{
g.drawOval(0,0,250,100);
g.setColor(Color.orange);
g.drawString("First applet",10,50);
}}