import java.util.Scanner;

class data{
	private int salary;
	private int ID;
	private int age;
	private String name;
	private String role;
	private boolean working;

	data(int ID, int salary, int age, String name, String role, boolean working){
        this.ID=ID;
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.role=role;
        this.working=working;
	}

	public void show()
	{
        if(this.working==true){
		    System.out.println(this.ID + " , " + this.name + " , " + this.age + " , " + this.salary + " , " + this.role);
		}
		else{	
            System.out.println(this.name + ", with the ID: " + this.ID + ", do not work for us anymore.");
         }
	}

    public void del(String ster)
    {
        if(ster==this.name){
            this.working=false;
        }
    }
}


/*
class Mymain{
    public static void main(String[] args) {
        data[] x_arr = new data[100];

        for(int i=0; i<2;i++){
            x_arr[i] = new data(123, 1234, 12, "testname", "role", true);
        }

        for(int i=0; i<2 ; i++){
            x_arr[i].show();
        }
    }   
}*/


class dataBase{

	public static void main(String[] args)
	{
	
	    data[] arr= new data[100];
	    int n; int age; int salary;
		String name; String role;
        Scanner sc= new Scanner(System.in);
		boolean working;
		
        System.out.print("Enter number of employees : "); 
        n=sc.nextInt();
		for(int i=0;i<n;i++){
            System.out.println("Records of Employee "+(i+1)+"------------------------");
            System.out.print("input the name: ");
			name=sc.next();
			
            System.out.print("input the age: ");
			age=sc.nextInt();
			
            System.out.print("input the salary: ");
			salary=sc.nextInt();
			
            System.out.print("input the role: ");
			role=sc.next();
			
			working=true;

			arr[i]= new data(i, salary, age, name, role, working); 
		}


		String ster;
		String m;
		boolean thewhile=true;
        String sw;
		while(thewhile==true){
            System.out.println("what do you want yo do?");
		    sw = sc.next();
		    switch(sw){
			    case "show" :   //for (data e : arr)	e.show();.
                                for(int i = 0; i<n  ; i++ ) arr[i].show();
							    System.out.println("Do you want to do something else ?");
							    m = sc.next();
							    if (m == "no") thewhile = false;
								break;

			case "delete" :     ster = sc.next();
							    //for (data e : arr)	e.del(ster); 
                                for(int i = 0 ; i<n ; i++) arr[i].del(ster); 
							    System.out.println("Do you want to do something else ?");  m= sc.next();
							    if(m=="no") thewhile=false;
								break;
		    }
        }

	}

}
