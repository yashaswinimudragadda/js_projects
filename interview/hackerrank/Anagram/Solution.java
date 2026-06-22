import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // 1. Jika panjangnya berbeda, sudah pasti bukan anagram
        if (a.length() != b.length()) {
            return false;
        }
        
        // 2. Ubah ke huruf kecil semua agar case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // 3. Ubah string menjadi array karakter
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        
        // 4. Urutkan kedua array karakter (secara alfabetis)
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        
        // 5. Jika setelah diurutkan isinya sama persis, maka keduanya anagram
        return Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
