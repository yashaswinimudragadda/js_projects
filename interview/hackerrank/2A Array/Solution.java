import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // ---- YOUR CODE STARTS HERE ----
        
        // Initialize to the minimum possible hourglass sum (-9 * 7 = -63)
        int maxSum = Integer.MIN_VALUE;

        // An hourglass is 3x3, so we loop through rows 0 to 3 and columns 0 to 3
        for (int r = 0; r <= 3; r++) {
            for (int c = 0; c <= 3; c++) {
                
                // Top row of the hourglass
                int top = arr.get(r).get(c) + arr.get(r).get(c + 1) + arr.get(r).get(c + 2);
                
                // Middle element of the hourglass
                int mid = arr.get(r + 1).get(c + 1);
                
                // Bottom row of the hourglass
                int bottom = arr.get(r + 2).get(c) + arr.get(r + 2).get(c + 1) + arr.get(r + 2).get(c + 2);
                
                int currentSum = top + mid + bottom;

                // Track the maximum sum found
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        // Print the final result on a single line
        System.out.println(maxSum);
    }
}
