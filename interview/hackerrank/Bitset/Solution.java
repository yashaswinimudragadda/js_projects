import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Create an array of size 3 to safely use indices 1 and 2
        BitSet[] bitSets = new BitSet[3];
        bitSets[1] = new BitSet(n);
        bitSets[2] = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            
            switch (op) {
                case "AND":
                    bitSets[p1].and(bitSets[p2]);
                    break;
                case "OR":
                    bitSets[p1].or(bitSets[p2]);
                    break;
                case "XOR":
                    bitSets[p1].xor(bitSets[p2]);
                    break;
                case "FLIP":
                    bitSets[p1].flip(p2);
                    break;
                case "SET":
                    bitSets[p1].set(p2);
                    break; 
            }
            
            // Print the cardinality (number of set bits) of both BitSets
            System.out.println(bitSets[1].cardinality() + " " + bitSets[2].cardinality()); 
        }
        
        sc.close();
    }
}
