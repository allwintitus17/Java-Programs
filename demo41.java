import java.util.Scanner;
public class demo41 {
    public static void main(String[] args) {
        int modulous,temp,n,sum=0;
        System.out.println("Enter the number to find wheather it is amstrong or not");
        Scanner demo41=new Scanner(System.in);
        n=demo41.nextInt();
        temp=n;
        for(temp=n;temp>0;temp=temp/10){
            modulous=n%10; 
            sum=sum+modulous*modulous*modulous;
        }
        if(temp==sum){
            System.out.println("it is an amstrong number");
        }
        else{
            System.out.println("it is not an amstrong number");
        }
    }
}
