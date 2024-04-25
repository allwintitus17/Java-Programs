public class pattern9 {
    public static void main(String[] args){
        int s=1;
        int n=10;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" "+ n);
                n=n-1;
            }
            System.out.println();
            s=s+1;
        }
    }
}
