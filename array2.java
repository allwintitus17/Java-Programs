import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("THE MATRIX Display");
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[][] a = new int [m][n];
        System.out.println("Matrix Display");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  
                a[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    
    }
   

}
