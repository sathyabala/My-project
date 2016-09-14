import java.io.*;
class Super
{
int a,b;
A(int x,int y)
{
x=a;
y=b;
}
int multi()
{return a*b;
}}
class B extends A
{
int c;
A(int x,int y,int z)
{
super(x,y);
c=z;
}
int multi()
{return a*b*c;}}

