public class VariablesDemo{
int instanceVar=10;
static String staticVar="l am static";
public void showVariables()
{
int localVar=5;
System.out.println("instance variable:"+instanceVar);
System.out.println("static variable:"+staticVar);
System.out.println("local variable:"+localVar);
}
public static void main(String[]args)
{
VariablesDemo obj1=new VariablesDemo();
obj1.showVariables();
System.out.println("accessing static variable via class:"+VariablesDemo.staticV
ar);
}
}