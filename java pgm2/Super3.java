import java.io.*;
class Super3
{
void display()
{
System.out.println("Hello");
}}
class Super4 extends Super3
{
void display()
{
System.out.println("Hello friends");
}
void return()
{
display();
super.display();}}
