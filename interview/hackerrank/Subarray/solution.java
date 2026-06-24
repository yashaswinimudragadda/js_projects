import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner in = new Scanner(System.in);
        //Read the size of the array
        int n= in.nextInt();
        int[] a=new int [n];
        
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        in.close();
        
        int negativeSubarraysCount =0;
        
        //outer loop pick the starting point of the subarray
        
        for(int i=0;i<n;i++){
            int currentSum =0;
            
            //Inner loop picks the ending point and updates the running Sum 
            
            for(int j=i;j<n;j++){
                currentSum +=a[j];
                
                // if the sum of the current subsarray isnegative , increment count
                
                if(currentSum <0){
                 negativeSubarraysCount++;   
                }
            }
        }
        
        //print the final count
        System.out.println(negativeSubarraysCount);
        
        
    }
    
    
}
