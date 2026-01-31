class Animal {
    Animal() {
        System.out.println("hello");
    }

    void run() {
        System.out.println("Animal is running");
    }
}

class Dog extends Animal {
    Dog() {
        super(); 
    }

    void run() {
        super.run(); 
        System.out.println("Dog is running fast!");
    }

    void Sound() {
        System.out.println("hi");
    }
}

class code6 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.run();   
        dg.Sound();
    }
}