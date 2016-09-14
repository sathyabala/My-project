import java.io.*;
class sathya
{
final public void display()
{
System.out.println("In Final show");
}
}
class Final1 extends sathya
{
public void display()
{
System.out.println("In Final1 Show");
}}
public class Final
{
public static void main(String args[])
{
Final1 obj=new Final1();
obj.display();}}