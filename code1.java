class Animal {
    void Sound(){
        System.out.println("the animal makes sound");
    }
    
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class code1{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.Sound();
        dg.bark();
    
    }
}
 
    

