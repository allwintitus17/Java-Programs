
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        int n = 10;

      Scanner all=new Scanner(System.in);
      System.out.println("Enter the User input:");
      int b=all.nextInt();

      if(b==4){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); 
            }
            for (int j = i; j <= 4; j++) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }
    }
 
    else if(b==5){
        int a = 21;


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); 
            }
            for (int j = i; j <= 6; j++) {
                System.out.print(a + " ");
                a--;
            }
            System.out.println();
        }
    }

    else{
        System.out.println("Enter correct number:");
    }
}

}
