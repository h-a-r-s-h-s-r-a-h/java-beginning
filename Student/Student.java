package Student;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int new_id){
        this.id = new_id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String new_name){
        this.name = new_name;
    }

    public String toString(){
        return id + " " + name; 
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id,that.id);
    }
}
