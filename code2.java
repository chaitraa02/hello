 
    class Animal {
    void Sound(){
        System.out.println("the animal makes sound");
    }
    
}
class Mammal extends Animal{
    void eat(){
        System.out.println("mammal eat");
    }
}
class Human extends Mammal{
    void walk(){
        System.out.println("human walk");
    }
}
class code2{
    public static void main(String[] args) {
        Mammal ml=new Mammal();
        Human hm=new Human();
        ml.eat();
        hm.walk();
    
    }
}
 