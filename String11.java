import java.util.Scanner;

public class String11 {
    public static void main(String[] args){

        String s1;
       
        Scanner hii=new Scanner(System.in);
   
        System.out.println("Enter the city name to display monuments:");
        s1=hii.nextLine();
        if(s1.equals("DELHI")){
            System.out.print("REDFORT");
        }
        else if(s1.equals("AGRA")){
            System.out.print("TAJMAHAL");
        }
        else if(s1.equals("JAIPUR")){
                System.out.println("JAL MAHAL");
        }
        else{
            System.out.println("GO TO SCHOOL");
        }

        
    
    }
}
