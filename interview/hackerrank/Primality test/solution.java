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

        String n = bufferedReader.readLine();
        int n = Integer.parseInt(n);
        if(n<0){
            return false;
         }else{
            for(int i=2;i<n;i++){
                boolean isprime=true;
                for(int j=i;j<Math.pow(2,i);j++){
                    if(n/j==0){
                        isprime=false;
                        break;
                    }
                    if(isprime){
                        System.out.println("prime");
                    }else{
                        System.out.println("not prime");
                    }
                }
                
            }
         }
        
        
        

        bufferedReader.close();
    }
}
