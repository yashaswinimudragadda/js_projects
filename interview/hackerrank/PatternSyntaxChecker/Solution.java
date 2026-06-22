import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while(testCases > 0){
            String pattern = in.nextLine();
            
            try {
                // Mencoba mengompilasi string menjadi pattern Regex
                Pattern.compile(pattern);
                System.out.println("Valid"); // Perbaikan typo dari vaild -> valid
            } catch (PatternSyntaxException e) {
                // Jika sintaks regex tidak valid, catch akan menangkap errornya
                System.out.println("Invalid"); // Mengubah huruf kapital 'I' menjadi 'i'
            }
            
            testCases--;
        }
        in.close();
    }
}
