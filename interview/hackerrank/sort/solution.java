import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalStudents = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while (totalStudents > 0) {
            int id = in.nextInt();
            String firstName = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, firstName, cgpa);
            studentList.add(st);
            
            totalStudents--;
        }
        in.close();
       
        // Sort the list using a custom Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 1. Compare CGPA in descending order
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                // 2. If CGPA is the same, sort by name alphabetically
                if (!s1.getFirstName().equals(s2.getFirstName())) {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
                // 3. If names are also the same, sort by ID in ascending order
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
      
        // Print the final sorted names
        for (Student st : studentList) {
            System.out.println(st.getFirstName());
        }
    }
}
