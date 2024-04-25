
import java.util.Scanner;
public class demo37 {
    public static void main(String[] args){
        System.out.println("PRIME NUMBERS!!");
             Scanner demo37=new Scanner(System.in);
             int n=demo37.nextInt();
             int s=0;
    /*a prime number should be divided by itself or  */
        if(n==0||n==1){
            System.out.println("it is not a prime number");
        }
        else{
            for(int i=2;i<n;i++){
               

                
                if(n%i==0){
                    s=1;
                   
                }
                else{
                    System.out.println(i);
                }
            }
            if(s==0)
            {
                System.out.println("it is  a prime number");
            }  
            else
            {
                System.out.println("it is not a prime number");
            }

            }
                
                                 

            }

            
        }
    

