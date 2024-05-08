import java.util.Scanner;

public class array6 {
    public static void main(String[] args){

        int a[]=new int[5];
        int b[]=new int[a.length];
        System.out.println("Enter the elements in the array");
        Scanner sca=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
              a[i]=sca.nextInt();
        }
        a[4]=7;
        System.out.println(a[4]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }
        System.out.println("B Array content");

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);   
        }
    }
}
