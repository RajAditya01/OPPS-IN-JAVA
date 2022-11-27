public class parent {
    //overridden method
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}

class child extends parent{
    //overriding method
    public void m1(){
        System.out.println("I am m1() of child");
    }
}
