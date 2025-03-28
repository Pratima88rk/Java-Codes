// sorting array-sort()method

//Note to use sort() method we need to import Arrays file from java.util package.
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        String[] names={"Pratima","Roshni","sima","Pooja"};
       Arrays.sort(names);
       System.out.println("sorted array is ;");
//first method to print array Using for loop
       for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
       }
//second method to print array using Arrays.toString() from Arrays file            
            System.out.println(Arrays.toString(names));
       

// Also sorting of int array
int[] array1 ={2,9,6,4,7};
Arrays.sort(array1);
 System.out.println("sorted int  array is ;");
for(int i=0;i<array1.length;i++){
 System.out.println(array1[i]);}
    }
}
