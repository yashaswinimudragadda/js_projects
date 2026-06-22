import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if (!scan.hasNextLine()) {
            System.out.println(0);
            scan.close();
            return;
        }
        
        String s = scan.nextLine();
        scan.close();
        
        // 1. Bersihkan spasi di awal dan akhir string
        s = s.trim();
        
        // 2. Antisipasi jika setelah di-trim string menjadi kosong
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        // 3. Pecah string berdasarkan karakter non-alfabet
        String[] tokens = s.split("[^A-Za-z]+");
        
        // 4. Cetak total jumlah token
        System.out.println(tokens.length);
        
        // 5. Cetak setiap token baris demi baris
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
