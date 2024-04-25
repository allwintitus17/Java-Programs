public class pattern10 {
    public static void main(String[] args) {
        int n=10;
    
       for(int i=1;i<=4;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
       for(int j=i;j<=4;j++){
        System.out.print(n+" ");
        n=n-1;
       }
       System.out.println();
       }

}

}