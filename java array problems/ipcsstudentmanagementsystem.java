import java.util.Scanner;
public class ipcsstudentmanagementsystem{

    public static void main(String[] args) {
        
        System.out.println("IPCS STUDENT MANAGEMENT SYSTEM!!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the Student:");
        String name=sc.nextLine();
        int rollno=sc.nextInt();
        int Fees=sc.nextInt();
        student student1=new student(name,rollno,Fees);
        student1.display();
        System.out.println("Total Profit of the Institute:");
        profitcalculator p1=new profitcalculator(Fees);
        p1.electricitybill();
        p1.maintenence();
        p1.Salary();
        p1.FinalProfit();



    }

}

class student{

        String name;
        int rollno;
        int Fees;

        student(String name,int rollno,int Fees){
            
            this.name=name;
            this.rollno=rollno;
            this.Fees=Fees;
        }
        void display(){
         
            System.out.println("name  :"+name);
            System.out.println("rollno:"+rollno);
            System.out.println("Fees  :"+Fees);

        }
    }

class profitcalculator{

    int Fees;
    float Salary;
    float Ebbill=0;
    float maintenence=0;
    float subtotal=0;
    float subtotal2=0;
    float subtotal3=0;


    profitcalculator(int Fees){
           

        this.Fees=Fees;
    }
    
   void electricitybill(){

    Ebbill=(Fees*3)/100;
    System.out.println("Ebbill:"+Ebbill);
    subtotal=Fees-Ebbill;
    

   }
   void maintenence(){
    maintenence=(subtotal*4)/100;
    System.out.println("Maintenence:"+maintenence);
    subtotal2=subtotal-maintenence;

    
   }
   void Salary(){
     
    Salary=(subtotal*10)/100;
    System.out.println("Salary of the Staffs:"+Salary);
    subtotal3=subtotal2-Salary;
    
   }

   void FinalProfit(){
    float profit;
    profit=subtotal3;

    System.out.println("the final profit of the ipcs is :"+profit);
   }

}
