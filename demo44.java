import java.util.Scanner;
public class demo44{

    public static void main(String[] args){
      Scanner demo44=new Scanner(System.in);
      int n=demo44.nextInt();
     
      for(int i=1;i<n;i++){
        int s=0;
      
        for(int j=2;j<i;j++){
           
             if(i%j==0){
               s=1;
           }
         
        }
        if(s==0){
            System.out.println(i);
           }
      }

    }
}