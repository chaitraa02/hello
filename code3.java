 class Animal {
    void Sound(){
        System.out.println("the animal makes sound");
    }
    
}
class Cat extends Animal{
    void meow(){
        System.out.println("cat meow");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog bark");
    }
}
class code3{
    public static void main(String[] args) {
        Cat ca=new Cat();
        Dog dg=new Dog();
        ca.meow();
        dg.bark();
    
    }
}
 
