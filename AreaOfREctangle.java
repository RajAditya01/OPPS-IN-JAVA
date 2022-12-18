import java.net.SocketPermission;

class rectangle{
    int length;
    int breadth;
//constructor default
    public rectangle(){
        length = 5;
        breadth= 5;
    }
    //parametrised const
    public rectangle(int l, int b){
        length = l;
        breadth=b;
    }
    
    //method
    public int area(){
        return length*breadth;
    }
}
public class AreaOfREctangle {
    public static void main(String[] args) {
        rectangle r1=new rectangle(); 
        System.out.println("Area="+r1.area());

        rectangle r2=new rectangle(5,8);
        System.out.println("areaa="+r2.area());
    }
    
    
}
