public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen("bilimora"); // create object and give constrctor // parameterized constructor
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.color= "yellow";
        System.out.println(p1.color);
        
        Pen p2 = new Pen(p1); // copy constructor

    }
}

class Pen {
    String color ;
    int tip ;

    Pen(Pen p1){  // copy constructor
        this.color = p1.color ;
        System.out.println(color);
    }

    Pen(String color){  // constructor
        this.color = color ;
        System.out.println(color);
    } 

    void setColor(String newColor) {
        color = newColor ;
    }

    void setTip(int newTip){
    tip = newTip ;
    }

}
