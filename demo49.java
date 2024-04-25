public class demo49 {
    public static void main(String[] args){
        int s=6;
        for(int i=5;i>0;i--){
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
            s=s+1;        }
    }
}