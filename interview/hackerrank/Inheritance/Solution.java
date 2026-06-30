import java.io.*;
import java.util.*;

// Write your code here
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits the add method from Arithmetic
}

public class Solution {
    public static void main(String []args) {
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to the add method (matching the sample output: 42 13 20)
        System.out.print(a.add(20, 22) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
     }
}
