abstract class Shape {
    abstract void draw();
    void message(){
        System.out.println("hello");
    }
    
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing");
    }
}
class code7{
    public static void main(String[] args) {
        Circle cl=new Circle();
        cl.draw();
        cl.message();
    }
}
