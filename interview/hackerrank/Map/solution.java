import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    
    //read the number of entries in the phone book
    
    int n=in.nextInt();
    in.nextLine();//consume the leftover newline character
    
    // initialize the map(key:name, value:phone number)
    Map<String,Integer> phoneBook = new HashMap<>();
    //populate the phone book
    for(int i=0;i<n;i++){
        String name= in.nextLine();
        int phone = in.nextInt();
        in.nextLine();//consume the newline after the phone number
        
        phoneBook.put(name,phone);
    }
    
    //read queries until end of file
    
    while(in.hasNext()){
        String query= in.nextLine();
        
        //check if the name exists in out phone book
        if(phoneBook.containsKey(query)){
            System.out.println(query+"="+phoneBook.get(query));
        }else{
            System.out.println("Not found");
        }
    }
    
    
    in.close();
    
    
    }
}
