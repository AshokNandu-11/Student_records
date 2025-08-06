package student_records;

import student_records.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Records{
   static ArrayList<Student> students = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("----Student Management System----");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. View Student");
            System.out.println("5. Exit...");
            System.out.println("Enter Your Choice:");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> addStudent();
                case 2 -> deleteStudent();
                case 3 -> updateStudent();
                case 4 -> viewStudent();
                case 5 -> System.out.println("Exiting....Thank You");
                default -> System.out.println("Invalid option");
            }
        }while (choice != 5);
    }
    static void addStudent(){
            System.out.println("Enter Student Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Student Marks: ");
            double marks = sc.nextDouble();
            students.add(new Student(id,name,marks));
            System.out.println("Student added Successfully");
    }
    static void deleteStudent(){
        System.out.println("Enter Student Id to Delete: ");
        int id = sc.nextInt();
        boolean remove = students.removeIf(s->s.id==id);
        if(remove){
            System.out.println("Student Deleted Successfully");
        }else{
            System.out.println("Invalid ID:"+id+"Please Check Id");
        }

    }
    static void updateStudent(){
        System.out.println("Enter the Student Id want to Update: ");
        int id = sc.nextInt();
        boolean found=false;
        for(Student s: students){
            if(s.id==id){
                System.out.println("Enter New Name of Student:");
                s.name = sc.nextLine();
                System.out.println("Enter New Marks of Student");
                s.marks = sc.nextDouble();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student with "+id+"Not Found");
        }
    }
    static void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No Records Found");
            return;
        }
        for (Student s : students){
            s.display();
        }
    }

}
