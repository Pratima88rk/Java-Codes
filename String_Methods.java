// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanobj=new Scanner(System.in);
        String name=scanobj.next();
        System.out.print("Enter your name:  ");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
         System.out.println("length of Entered name is "+name.length());
        
    }
}
