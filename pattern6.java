public class pattern6 {
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
    }
}