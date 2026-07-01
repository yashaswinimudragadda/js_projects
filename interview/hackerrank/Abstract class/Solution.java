import java.util.Scanner;

// Provided abstract class
abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

// Your task: Write the MyBook class
class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

// Main class to handle input and output
public class Main {
    public static void main(String[] args) {
        // Book new_novel = new Book(); // This would throw an error because Book is abstract
        
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }
}
