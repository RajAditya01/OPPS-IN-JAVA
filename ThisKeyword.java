/* 

this keyword --> Refer current invoking object.
this()--> for calling current class constructor from inside different constructor of same class. 


# EXAMPLE:

class Test{
    public void show(){
        this.a;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.show();
    }
    
}

*/