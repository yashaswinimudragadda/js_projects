import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 1. Read size and initial elements
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        
        // 2. Read the total number of queries (Q)
        int q = in.nextInt();
        
        // 3. Loop through exactly Q times
        for (int i = 0; i < q; i++) {
            String queryType = in.next(); // Reads "Insert" or "Delete"
            
            if (queryType.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                // ArrayList handles shifting elements automatically
                a.add(index, value); 
            } else if (queryType.equals("Delete")) {
                int index = in.nextInt();
                // Direct removal by index, no manual loop needed
                a.remove(index); 
            }
        }
        in.close();
        
        // 4. Print the final result in a single line
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
