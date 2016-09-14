class p
{
public void child1()
{
System.out.println("land,gold");
}
public void child2()
{
System.out.println("land");}
}
class p1 extends p
{
public void child2()
{
System.out.println("land,gold,house");
}
}
class Parent
{
public static void main(String args[])
{
p obj=new p1();
obj.child2();
}} 

