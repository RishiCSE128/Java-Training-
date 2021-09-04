package Inheritace;
abstract class Base{
    // attributes
    private int x, y;  // hieght and width of a rectacngle 

    //methods
    public Base(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] get(){
        int[] ret = new int[2];
        ret[0] = this.x;
        ret[1] = this.y;
        return ret; 
    }

    public void set(int x, int y){
        this.x=x;
        this.y=y;
    }

    abstract int area();
    abstract int perimeter();

    public void show(){
        System.out.println("The value of x="+this.x+" y="+this.y);
    }
}

class Child extends Base{
    // attribute

    // methods
    public Child(int a, int b){
        // I want to pass a, b to my parant classs
        super(a,b); 
    }

    public int area(){
        int[] temp = super.get();
        int x = temp[0] ; int y = temp[1]; 
        return x*y;
    }

    public int perimeter(){
        int[] temp  = super.get();
        return 2*(temp[0]+temp[1]); 
    }
 
    public void show(){   // method overriding
        int[] temp = super.get();
        System.out.println("The values are: "+temp[0]+" "+temp[1]);
    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        Child c = new Child(5, 6);  
        c.show();
        //c.x=20 ; c.y=30;
        c.set(20, 30);
        c.show();
        System.out.println("Area is : "+c.area());
    }
}
