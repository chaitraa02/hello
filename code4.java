class Animal {
    void Sound(){
        System.out.println("hello");
    }
    
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("hi");
    }
}
class code4{
    public static void main(String[] args) {
       Dog dg=new Dog();
       dg.Sound(); 
    }
}


