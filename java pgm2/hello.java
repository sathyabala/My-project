import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
public class hello extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World",20,30);
}}
<applet code="hello.class" archive="x.jar" width=400 height=300>
</applet>