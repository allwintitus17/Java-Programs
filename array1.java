import java.util.Scanner;
public class array1 {
    public static void main(String[] args){

        System.out.println("THE ARRAYS");
          Scanner s1=new Scanner(System.in);
        /*int a[]={1,2,3,4,5};*/
          int n=s1.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
         
             b[i]=s1.nextInt();
        }

        for(int i=0;i<n;i++){
             System.out.println(b[i]);
        }
    }
    
}
