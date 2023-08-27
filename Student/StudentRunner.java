package Student;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class StudentRunner {
    public static void main(String[] args){
        List<Student> students = List.of(new Student(1,"Harsh"),new Student(4,"Kartik")
        , new Student(2,"Roushan"));
        
        ArrayList<Student> my = new ArrayList<>(students);
        System.out.println(my);


        Collections.sort(my);
        System.out.println(my);
    }
}
