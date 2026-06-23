import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=in.next();
        }
        in.close();
        
        Arrays.sort(s,0,n,(a1,a2)->{
            BigDecimal b2 = new BigDecimal(a2);
            BigDecimal b1=new BigDecimal(a1);
            return b2.compareTo(b1);
        });
        
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
