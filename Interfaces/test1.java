package Interfaces;

import java.util.Scanner;

interface GrandFather{
    //attributes
    public final double pi=3.1412;
    //methods
}

interface Father extends GrandFather{
    // attribute

    // methiods
    int area(int a, int b);  // returns the area of a rectangle 
    double area(int r);     // returns the area of a circle 
}

interface Mother extends GrandFather{
    // attribute 

    // methods
    int perimeter(int a, int b); // returns the perimeter of a rectangle 
    double perimeter(int r);     // return the perimeter of a circle 
}

class Child implements Father, Mother {
    
    public double area(int r){ return 2*pi*r ; }
    public int area(int a, int b){ return a*b; }
    public double perimeter(int r) {return 2*pi*r; }
    public int perimeter(int a, int b) {return 2*(a+b); }
}

class MyMain{
    public static void main(String[] args) {
        int a,b,r;
        Child c = new Child();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sides of a rectangle : ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.print("Emter the redius of a circle : ");
        r=sc.nextInt();

        System.out.println("Area and perimeter of the Ranctngle is :"
                             + c.area(a,b) + " , " + c.perimeter(a, b));
        System.out.println("Area and perimeter of the Ranctngle is :"
                             + c.area(r) + " , " + c.perimeter(r));
        sc.close();
    }
}