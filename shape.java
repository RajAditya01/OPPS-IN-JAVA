public interface shape {
    public static final int i=50;
    public abstract void calculateArea();
}

class Circle implements shape{
    public void calculateArea(int r){
        System.out.println("Area of circle is "+(Math.PI*5*5));
    }
    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.calculateArea();
    }

}
