import java.io.*;
import java.util.*;
import java.lang.reflect.Method;

class Printer {
    // Your generic method is perfectly written!
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        // FIX 1: Declared the missing stringArray
        String[] stringArray = {"Hello", "World"}; 
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        
        int count = 0;
        // FIX 2: Changed getDeclaredMethod() to getDeclaredMethods()
        for (Method method : Printer.class.getDeclaredMethods()) { 
            String name = method.getName();
            if (name.equals("printArray"))
                count++;
        }
        
        if (count > 1) System.out.println("Method overloading is not allowed!");
    }
}
