import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        String a = in.next();
        String b= in.next();
        
        if(a.length()>0 && b.length()>0){
        
        BigInteger A=new BigInteger(a);
        BigInteger B=new BigInteger(b);
        
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
        
        }
        in.close();
        
        
    }
}
