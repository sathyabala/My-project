class Exception{
public static void main(String args[])
{
int i=5;
int j=0;
int k=0;
try{
k=i/j;
}
catch(Exception e)
{
System.out.println("error" +e);
}
System.out.println("cant divided by zero");
}}