abstract public class Myclass {
    
    //complete method 
    public void cal()
    {
        System.out.println("Calculating results");

    }

    //abstract method
    abstract public void launchRocket(); 
}
//abstraction class not be instantiated
class start{
    public static void main(String[] args) {
        Myclass ob = new Mychild();
        ob.cal();
        ob.launchRocket();
    }
}
