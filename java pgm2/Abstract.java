import java.io.*;
abstract class sathya
{
public void call()
{System.out.println("Calling");
}
public abstract void dance();
public abstract void jump();
public abstract void sing();
}
abstract class vandhana extends sathya
{
public void sing()
{
System.out.println("Singing");
}}
class sakthi extends vandhana
{
public void jump()
{System.out.println("jumping");
}
public void dance()
{System.out.println("dancimg");
}}
class Abstract
{
public static void main(String args[])
{
sathya obj=new sakthi();
obj.call();
obj.dance();
obj.jump();
obj.sing();}}