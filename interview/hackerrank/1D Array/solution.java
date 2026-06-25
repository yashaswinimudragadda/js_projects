import java.io.*;
import java.util.*;

public class Solution{
    public static void  main(String [] args) throws IOException{
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            int value = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(value);
        }
        
        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
        
    }
}
