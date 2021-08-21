package Session_4;
import java.util.Scanner;

public class Control_struct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int x = sc.nextInt();

        // if-else
        if( x  > 100){
            System.out.println("This is a 3 digit number ");
        }
        else{
            System.out.println("otherwise... ");

        }

        // switch-case
        switch(x){ 
            case 1 :  System.out.println("1"); break;
            case 2 :  System.out.println("2"); break;
            case 3 :  System.out.println("3"); break;
            default : System.out.println("default");
        }

        // for each : find evens 
        int[] arr = {1,2,3,4,5,22, 13,45};
        //int i, 
        int c=0;
        /*
        for(i=0;i<8;i++){
            if(arr[i]%2 == 0)
                c++;
        }
        */

        for(int i : arr){         // for each i in arr do
            if(i%2 == 0)          // stmts
                c++;
        }

        System.out.println("number of evens = "+c);
        

    }
}