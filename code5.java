 class Animal {
    Animal(){
        System.out.println("hello");
    }
    
}
class Dog extends Animal{
    Dog(){
    super();}
    void Sound(){
        System.out.println("hi");
    }
}
class code5{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.Sound();
    }
}
