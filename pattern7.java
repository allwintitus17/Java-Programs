public class pattern7 {
    //pyramid logic
    public static void main(String[] args){
        int s=6;
        /*diffrent outputs */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
            s=s-1;
        }
        int c=1;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=c;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" *");
            }
            System.out.println();
            c=c+1;
        }
    }
}