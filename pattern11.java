import java.util.Scanner;

class pattern11 {
    public static void main(String[] args){
           int sum=0;
           int n = 0;
           int t;
        System.out.println("Enter the numbers to print pattern:");
        Scanner all=new Scanner(System.in);
        int a=all.nextInt();
        for (int k=1;k<=a;k++){
             sum=sum+k;
              n=sum;
              System.out.println(n);
        
        }
       
        if(n==10){
            t=4;
        }
        else{
            t=6;
        }
        
        
     for (int i = 1; i <= t; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); 
            }
            for (int j = i; j <= t; j++) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }
    

    }
}