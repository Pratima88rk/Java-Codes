// static method making and calling in static area
import java.util.Scanner;
class Main{
    //Creating ststic method
      static void name(){
          Scanner scano=new Scanner(System.in);
          String fname=scano.nextLine();
          System.out.println("Enter the your full name");
          System.out.println("Name is "+fname+".");
        }
    public static void main(String[] args){
//calling static method. Note:- static method can be called without making object 
      name();
    }
}
