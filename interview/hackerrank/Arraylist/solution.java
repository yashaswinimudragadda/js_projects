import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of lines
        int n = scanner.nextInt();
        
        // Create a 2D ArrayList (List of Lists)
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Loop to read each line's data
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Number of elements in the current line
            ArrayList<Integer> currentLine = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                currentLine.add(scanner.nextInt()); // Add elements to the inner list
            }
            lines.add(currentLine); // Add the inner list to the main list
        }
        
        // Read the total number of queries
        int q = scanner.nextInt();
        
        // Loop to process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); // 1-based line index
            int y = scanner.nextInt(); // 1-based position index
            
            // Convert to 0-based index for Java ArrayList
            int lineIndex = x - 1;
            int positionIndex = y - 1;
            
            // Boundary check to prevent IndexOutOfBoundsException
            if (lineIndex >= 0 && lineIndex < lines.size() && 
                positionIndex >= 0 && positionIndex < lines.get(lineIndex).size()) {
                System.out.println(lines.get(lineIndex).get(positionIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}
