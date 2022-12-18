class Student {
    //data member : instance veriable
    int student;
    String studentName;
    String studentCity;
    String studentState;
    int studentRollNo;


    //Constracutor Overloading-->creating more than one const.
    public Student(){
        System.out.println("creating object: Non parametrised constructor.");
    }
    public Student(int s){
        System.out.println("Prametrised Constructor :(int)");
    }

    //Behavior : member method: method : functions

    public void study(){
        System.out.println(studentName + " is Studyng");
    }
    public void showFulldetail(){
        System.out.println("My name is "+studentName);
        System.out.println("My Roll No is "+studentRollNo);
        System.out.println("My city is "+studentCity);
        System.out.println("My State is "+studentState);
    }

}
public class classObject {
    public static void main(String[] args){
        //creating object of student.

        Student s1 = new Student(); //Constructor
        //s1=new Student();

        s1.studentName="Aditya";
        s1.studentRollNo=11212714;
        s1.studentCity="Muzaffarpur";
        s1.studentState="Bihar";
        s1.showFulldetail();
        s1.study();

        
        Student s2 = new Student(10); //Constructor
        //s2=new Student();

        s2.studentName="Akshat";
        s2.studentRollNo=11212507;
        s2.studentCity="Yamunanagar";
        s2.studentState="Haryana";
        s2.showFulldetail();
        s2.study();
    }
}