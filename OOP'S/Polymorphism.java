public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        // System.out.println(cal.sum(2, 3));
        // System.out.println(cal.sum(2, 3, 1));
        // System.out.println(cal.sum((float)3.2, (float)4.8));

        cat c = new cat() ;
        c.eat();
    }
}

//mathod over loading (compile time polymorphism)
class Calculator{ 
    int sum(int a , int b){
        return a+b ;
    }

    float sum(float a , float b){
        return a +b ;
    }

    int sum(int a , int b , int c){
        return a+b+c ;
    }
}


// method overriding ( run time polymorphism)
class Animal{
    void eat(){
        System.out.println("Eat anything.");
    }
}

class cat extends Animal{
    void eat(){
        System.out.println("I like to drink milk.");
    }
}