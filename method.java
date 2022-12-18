class paret{
    void display(){
        System.out.println("Hello I am Parent!!");
    }
}

class child extends parent{
    void display(){
        System.out.println("Hello I am Child");
    }
}
public class method {
    public static void main(String[] args) {
        parent a1=new parent();
        a1.display();

        child c1=new child();
        c1.display();
    }
}
