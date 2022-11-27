// Constructor invocation in inheritance

class fruit{
    String name;
    fruit(){
        System.out.println("Fruit");
    }
    fruit(String n){
        name=n;
        System.out.println("Fruit Parametrised"+name);
    }
}
class Apple extends fruit{
    String name;
    Apple(){
        System.out.println("Apple");
    }
    Apple(String n){
        name=n;
        System.out.println("Apple Parametrised "+name);
    }
}

public class ConstructorInvokation {
    public static void main(String[] args) {
        Apple obj=new Apple();
        Apple obj2=new Apple("Green");
    }
    
}
