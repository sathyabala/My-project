interface maths
{
void add();
void mul();
void mod();
}
interface maths1{
void display()
{
System.out.println("display...........");
}}
interface maths2 extends maths,maths1{
void display1()
{
System.out.println("display1");}}
class Myclass implements maths2
{
public static void main(String args[])
{ Myclass obj=new Myclass();
  obj.display1();
}
}