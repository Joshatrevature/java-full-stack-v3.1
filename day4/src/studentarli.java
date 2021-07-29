import java.util.*;

class Student{
    public int id;
    public String name, email;

    public Student(int id, String name, String email){
        this.id = id;
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class studentarli {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Mark", "m@gmail.com");
        Student student2 = new Student(2, "Paul", "p@gmail.com");
        Student student3 = new Student(3, "Watson", "w@gmail.com");

        ArrayList<Integer> numbers = new ArrayList<>();


        // create arrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Student student: students){
            System.out.println(student);
        }
    }
}
