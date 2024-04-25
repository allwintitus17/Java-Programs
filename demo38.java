import java.util.Scanner;

public class demo38{
    public static void main(String[] args){
        Scanner demo38 = new Scanner(System.in);
        int count=0;
        System.out.println("Prime numbers");
        int n=demo38.nextInt();
        int s=0;
        if(n==0||n==1){
            System.out.println("It is not a prime number!!");
        }
        else{

            for(int i=2;i<n;i++){

               if(n%i==0){
            
                s=1;
                 
               }
            }
            if(s==0){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("it is not a prime number");
            }
        }
    }
}