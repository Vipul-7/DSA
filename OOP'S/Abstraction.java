

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // System.out.println(h.color);
        // h.walk();
        
        Bear b = new Bear();
        b.meat();
    }
}

// class abstraction
abstract class Animal{    // we cannot create Animal's objecct

    String color;
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats.");
    }

    abstract void walk(); 
    abstract void horns();
}

class Horse extends Animal{
    void setColor(){
        color = "Kathhai" ;
    }

    void walk(){
        System.out.println("horse walk with 4 leg");
    }

    void horns(){
        System.out.println("horse have horns.");
    }

}

// Interfaces
// all abstraction(100% abstraction)
// implements keyword

interface Harnivore{
    void grass();
}

interface Carnivore {
    void meat();
}

class Bear implements Harnivore , Carnivore{
    public void grass(){
        System.out.println("yes grass");
    }

    public void  meat(){
      System.out.println("not meat");
    }
}