package student_records;

public class Student {
    int id;
    double marks;
    String name;
    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println("ID: "+id +"| Name: "+name+"| Marks: "+marks);
    }
}

