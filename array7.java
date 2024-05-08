import java.util.Scanner;
public class array7 {
    public static void main(String[] args){

        System.out.println("Finding pairs");

        int a[]={8,7,2,5,3,1};
        int target;
        System.out.println("Enter the target value to find the pair");
        Scanner a1= new Scanner(System.in);
        target =a1.nextInt();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                  System.out.println(a[i]+" "+a[j]);
                  
                  
                }
               
            }
        }

        

    }
}
