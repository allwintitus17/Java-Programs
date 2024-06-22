import java.util.Scanner;

public class ipcsbank {
    
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO IPCS BANKING SYSTEM ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Account Number:");
        int accno=sc.nextInt();
        CoustmerDetailsService cd=new CoustmerDetailsService(accno);
    }

}
class CoustmerDetailsService{

    String cname[]={"Allwin","Nandha","bala","Ana","niru"};
    int caccno[]={123,234,345,456,567};
    int cpin[]={1234,2345,3456,4567,5678};
    int cbalance[]={10000,40000,50000,100000,2000};
    String cphoneno[]={"9842282349","9843384999","9043377199","9677463698","9296762671"};
    int s=0;
    

    public CoustmerDetailsService( int accno) {
        
        for(int i=0;i<caccno.length;i++){
             
            if(caccno[i]==accno){
                
                System.out.println("  Welcome to ipcs bank "+cname[i]);
                System.out.println("1.) CHECK BALANCE");
                System.out.println("2.) DEPOSIT");
                System.out.println("3.) WITHDRAW");
                System.out.println("4.) CHANGE PHONE NUMBER");
                System.out.println("5.) CHANGE PIN");
                s++;
            }
            
        }
        if(s==0){
            System.out.println("pls Enter your valid number:");
            
        }
           chooseService();
        
       
    }
    void chooseService(){
  

        System.out.println("Enter Your Choice of Services:");
        Scanner sc1=new Scanner(System.in);
        int choice=1;

        while(choice!=0)
        {
            choice=sc1.nextInt();
            switch (choice) {
                case 1 -> balance(cbalance,cpin);
                case 2 -> Deposit(cbalance,cpin);
                case 3 -> withdraw(cbalance,cpin);
                case 4 -> changephone(cphoneno);
                case 5 -> changepin(cpin);
                case 6 -> display(cname, caccno, cpin, cphoneno, cbalance);
            }
                
        
        }

        


    }
    void balance(int balance[],int cpin[]){
  
        int t=0;
        System.out.println(" welcome to Balance checking portal");
        
        System.out.println("Enter The Pin Number:");
        Scanner sc1=new Scanner(System.in);
        int pin=sc1.nextInt();
        for(int i=0;i<balance.length;i++){
               
            if(cpin[i]==pin){

                System.out.println("Balance:"+cbalance[i]);
                t++;

            }

        }
        if(t==0){
            System.out.println("Pin is not valid");
        }





    }
    void Deposit(int balance[],int cpin[]){
        int bal=0;
        int t=0;
        int depositamt=0;
        System.out.println("Welcome to Deposit portal");
        System.out.println("Enter The Pin Number:");
        Scanner sc1=new Scanner(System.in);
        int pin=sc1.nextInt();
        for(int i=0;i<balance.length;i++){
               
            if(cpin[i]==pin){

                System.out.println("Balance:"+cbalance[i]);
                
                System.out.println("enter the deposit amount:");
                depositamt=sc1.nextInt();
            
                bal=balance[i]+depositamt;
                 t++;

            }
            

        }

        System.out.println("the added amount "+depositamt+"the actual amount in bank:"+bal);
        if(t==0){
            System.out.println("Pin is not valid");
        }




    }
    void withdraw(int balance[],int cpin[]){
        int temp=0;
        int flag=0;
        System.out.println("Welcome to Withdrawel portal");
        int bal=0;
        int t=0;
        int withdrawamt=0;
        System.out.println("Enter The Pin Number:");
        Scanner sc1=new Scanner(System.in);
        int pin=sc1.nextInt();
        for(int i=0;i<balance.length;i++){
               
            if(cpin[i]==pin){

                t++;
                System.out.println("Balance:"+cbalance[i]);
                System.out.println("enter the withdraw amount:");
                withdrawamt=sc1.nextInt();

               
                
            
               
               

            }
            if(balance[i]>withdrawamt){
                bal=balance[i]-withdrawamt;
                 temp=bal;
                flag++;
                break;
            }
            

        }


        System.out.println("the withdraw amount "+withdrawamt+"the actual amount in bank:"+temp);
        if(t==0){
            System.out.println("Pin is not valid");
        }

        if(flag==0){
            System.out.println("insufficient balance");
        }



    }
    void changephone(String cphoneno[]){
            String temp;
            String oldphonenumber;
        System.out.println("Welcome to phone number change portal");
        System.out.println("Enter the Old phone number to be changed");
             Scanner sc=new Scanner(System.in);
             oldphonenumber=sc.nextLine();
        for(int i=0;i<cbalance.length;i++){
                if(cphoneno[i].equals(oldphonenumber)){
                  
                    System.out.println("Enter the new phone number to update:");
                    String newphonenumber=sc.nextLine();
                    cphoneno[i]=newphonenumber;
                    System.out.println("the number got updated");
                }

        }
       
}
void changepin(int cpin[]){

       System.out.println("Changing pin");
       int temp=0;
            int oldpin;
        System.out.println("Welcome to pin number change portal");
        System.out.println("Enter the Old pin number to be changed");
             Scanner sc=new Scanner(System.in);
             oldpin=sc.nextInt();
        for(int i=0;i<cbalance.length;i++){
                if(cpin[i]==oldpin){
                  
                    System.out.println("Enter the new phone number to update:");
                    int newpin=sc.nextInt();
                    cpin[i]=newpin;
                    temp=cpin[i];
                    System.out.println("the  pin number got updated");
                }

        }
        System.out.println("the old pin is "+oldpin+"the new pin"+temp);

}

void display(String name[],int caccno[],int cpin[],String cphoneno[],int cbalance[]){

 
    System.out.println("Details of the coustomers");
        System.out.println("name    |accountnumber    |pinnumber     |phonenumber      |balance");
    for(int i=0;i<cname.length;i++){

      
        System.out.println(name[i]+"   "+caccno[i]+"    "+cpin[i]+"    "+cphoneno[i]+"  "+cbalance[i]);
    }

}

    }

