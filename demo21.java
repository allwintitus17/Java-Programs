import java.util.Scanner;
public class demo21{
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int num=1;
        Scanner np1=new Scanner(System.in);
        
        while(num!=0){
            num=np1.nextInt();
            sum+=num;

            i++;

        }
        System.out.print(sum);
    }
}