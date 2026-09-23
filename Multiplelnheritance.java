interface A{
void displayA();
}
interface B {
void display();
}
class c implements A,B{
public void displayA(){
system.out.println("this is interface A");
}
public void display(){
system.out.println("this is interface B");
}
}
public class MultipleInheritance{
public static void main(string[] args){
c obj=new c();
obj.displayA();
obj.displayB();
}
}
