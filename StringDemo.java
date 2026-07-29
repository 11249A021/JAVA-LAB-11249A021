public class StringDemo{
public static void main(String[] args){
String str = "java programming";
System.out.println("Original String:"+str);
System.out.println("length:"+str.length());
System.out.println("Uppercase:"+str.toUpperCase());
System.out.println("Lowercase:"+str.toLowerCase());
System.out.println("Substring:"+str.substring(5,16));
System.out.println("Contains 'java':"+str.contains("java"));
}
}