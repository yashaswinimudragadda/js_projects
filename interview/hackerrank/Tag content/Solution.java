import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        // Regex pattern to match valid tags and capture their contents
        String regex = "<([^>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        
        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            
            // Find all valid matches in the current line
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            
            if (!found) {
                System.out.println("None");
            }
            
            testCases--;
        }
        in.close();
    }
}
