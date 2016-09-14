import java.awt.*;
class LoginPage extends Frame
{
LoginPage(){
this.setVisible(true);
this.setSize(700,700);
this.setLayout(new FlowLayout());

Label l=new Label("UserName");
Label l1=new Label("password");

TextField tf=new TextField(15);
TextField tf1=new TextField(15);

Button b=new Button("Login");
Button b1=new Button("cancel");

add(l);
add(l1);
add(tf);
add(tf1);
add(b);
add(b1);
}
public static void main(String args[])
{
new LoginPage();}}