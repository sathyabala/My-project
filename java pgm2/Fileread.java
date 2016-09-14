import java.io.*;
class fileread
{
public static void main(String args[])
{
try{
string str;
FileInputStream fis=new FileInputStream("abc.txt");
int i;
while((i=fis.read())!=-1)
{
System.out.println((char)i);
}
fin.close();
}
catch(Exception e)
{}
}
}