import java.util.Scanner;
public class demo36 {
   public static void main(String[] args){

    System.out.println("How to Find the possible divident for the numbers");
    Scanner demo36=new Scanner(System.in);
    int n=demo36.nextInt();
    if(n==0){
        System.out.println("number cant be divided by the zero");
    }
    else{
        for(int i=1;i<100;i++){
             if(n%i==0){
                System.out.println(i);
             }
            
        }

    }

   }
    
} 
