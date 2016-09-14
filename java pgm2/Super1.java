import java.io.*;
class Super1
{
int a=8;
}
class Super2 extends Super1
{
int a=9;
void Display()
{
System.out.println(super.a);
}
}