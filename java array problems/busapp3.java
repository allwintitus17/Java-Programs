import java.util.Scanner;
public class busapp3 {
   
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("IPCS BOOKING CENTER!!");

        int buscostcapacity[][]={

            {20,25},
            {40,55},
            {30,45}
        };

        String srcDest[][]={

            {"chennai", "Andhra","101"},
            {"chennai", "erode","102"},
            {"mumbai", "jammu","103"},
            };


            int choice;
            
            System.out.println("Enter the Choice:");
            System.out.println("1.)Display the bus Details:");
            System.out.println("2.)BOOK TICKETS");

            choice=sc.nextInt();

            switch(choice){

                case 1 ->Display_Bus(buscostcapacity,srcDest);
                case 2 ->book_tickets(buscostcapacity,srcDest);
                default -> System.out.println("Enter the Correct option:");

            }
        }
         public static void Display_Bus(int buscostcapacity[][],String srcDest[][]){
                        
            System.out.println("Display Bus Details");
            for(int i=0;i<srcDest.length;i++){
                  System.out.println("BUS NO            :" + srcDest[i][2]);
                  System.out.println("SOURCE            :" + srcDest[i][0]);
                  System.out.println("DESTINATION       :" + srcDest[i][1]);
                  System.out.println("AVAILABLE SEATS   :" + buscostcapacity[i][0]);
                  System.out.println("TICKET PRICE  ₹   :" + buscostcapacity[i][1]+"₹");
                  System.out.println();
            }
         }
       public static void book_tickets(int buscostcapacity[][],String srcDest[][]){
        Scanner sc=new Scanner(System.in);
        
                  System.out.println("Enter the Name of the Passenger:");
                  String name=sc.nextLine();
                  System.out.println("Enter the Phone number of the Passenger:");
                  String number=sc.nextLine();

    
    }

