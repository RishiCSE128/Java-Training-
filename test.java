import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String fname = sc.next();
        String lanme = sc.next(); 

        System.out.println("Hello "+ fname + " " + lanme);

        sc.close();
    }
}