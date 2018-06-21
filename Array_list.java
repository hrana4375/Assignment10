
package questions;
import java.util.*;
import java.util.Scanner;

    public class Array_list {
        ArrayList list;
        static int size;
        public void make(int size) {
          size=2*size;
          list = new ArrayList(size); 
        }
        public void study() {
            list.add(5);
            list.add(6);
            list.add(34);
            list.add(1, 99);
            System.out.println("Initial List\n"+list);

            list.remove(0);
            System.out.println("\nAfter Remove Func\n"+list);

            list.set(1, 100);
            System.out.println("\nAfter Set Func\n"+list);
         }
        public static void main(String args[])  {
                       
            Array_list ob = new Array_list();

            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the Size of the ArrayList=");
            ob.size=obj.nextInt();
  
            ob.make(size);
            ob.study();
            
            
            
        }
    
}
