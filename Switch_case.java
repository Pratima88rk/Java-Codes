
// Switch case
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int standard;
        Scanner scano=new Scanner(System.in);
        System.out.println("Enter the standard number");
        standard=scano.nextInt();
        
        switch(standard){
            case 1:
                System.out.print("Kuldeep sah\b");
                break;
            case 3:
                 System.out.print("Aayush sah\b");
                 break;
            case 10:
                 System.out.print("Sima Sah and Mahadev Sah\b");
                break;
   case 12:
                 System.out.print("Pratima sah\b");
                break;

                
        }
         System.out.println("studies in "+standard);
       
    }
}
