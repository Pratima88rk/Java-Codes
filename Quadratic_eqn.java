//Write a Java program to solve quadratic equations (use if, else if and else). 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scano=new Scanner(System.in);
         System.out.println("enter quadratic equation a(x.x)+bx+c=0 \n");
        
        System.out.println("enter a");
         int a=scano.nextInt();
        System.out.println("enter b");
         int b=scano.nextInt();
        System.out.println("enter c");
         int c=scano.nextInt();
         int temp=b*b-4*a*c;
         System.out.println(temp);
        int result;
        if(temp==0){
           result=(-b)/2*a; 
           System.out.println("The value of x is :"+result);
        } 
        else if(temp>0){
            result=((-b)+(temp)^(1/2))/(2*a);
             System.out.println("The value of x is :"+result);
             result=((-b)-(temp)^(1/2))/(2*a);
              System.out.println("and "+result);
        }
        else{
            System.out.println("number is complex number");
        }
    }
}
