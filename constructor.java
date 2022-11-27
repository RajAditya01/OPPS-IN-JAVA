class Student {
    //data member : instance veriable
    int student;
    String studentName;
    String studentCity;
    String studentState;
    int studentId;


    //Constracutor Overloading-->creating more than one const...
    //No of Argu is Different.
    // type of argu is Different.
    // order of argu is Different. 


    public Student(){
        this(11212505,"Punit","Hisar","Haryana");
        System.out.println("creating object: Non parametrised constructor");
    }
    public Student(int s){
        System.out.println("Prametrised Constructor :(int)");
    }
    public Student(int i,String n, String c, String s){
        studentId =i;
        studentName= n;
        studentCity = c;
        studentState = s;
    }

    //Behavior : member method: Method : functions

    public void study(){
        System.out.println(studentName + " is Studyng");
    }
    
    //METHOD OVERLOADING-->Having multiple methods in same class with same name.
    //NO of Argu is Different
    //type of argu is Different
    //order of argu is Different 

    public void study(float f){

    }


    public void showFulldetail(){
        System.out.println("My name is "+studentName);
        System.out.println("My ID is "+studentId);
        System.out.println("My city is "+studentCity);
        System.out.println("My State is "+studentState);
    }

}
public class constructor {
    public static void main(String[] args){
        //creating object of student.
        System.out.println();
        Student s1 = new Student(); //Constructor 1
        //s1=new Student();

        s1.studentName="Aditya";
        s1.studentId=11212714;
        s1.studentCity="Muzaffarpur";
        s1.studentState="Bihar";
        s1.showFulldetail();
        s1.study();
        System.out.println();

        
        Student s2 = new Student(2); //Constructor 2
        //s2=new Student();

        s2.studentName="Akshat";
        s2.studentId=11212507;
        s2.studentCity="Yamunanagar";
        s2.studentState="Haryana";
        s2.showFulldetail();
        s2.study();
        System.out.println();

        Student s3 = new Student(11212781,"Babarangi","Patna","Bihar"); //Constructor 3
        s3.showFulldetail();
        s3.study();
        System.out.println();
    }
}