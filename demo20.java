import java.util.Scanner;
public class demo20 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers if it is a zero it will come out from the looop:");
        Scanner n1=new Scanner(System.in);
        int num=1;
        int positivenum=0,negativenum=0;
      while(num!=0){
        
         
        num=n1.nextInt();
        if(num<0){
          
           negativenum++;

        }
      
        else{
         
            positivenum++;
           
        }
      }
      System.out.println("THE TOTAL POSITIVE NUMBERS ARE THE:  "+positivenum);

      System.out.println("THE TOTAL Negative NUMBERS ARE THE:  "+negativenum);

    }
}
