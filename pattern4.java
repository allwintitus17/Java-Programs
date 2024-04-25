public class pattern4 {
    public static void main(String[] args) {
        int n=10;
       System.out.println("inverted start patern");
       for(int i=0;i<5;i++){
        for(int j=i;j<4;j++){
            System.out.print(n + "  ");
            n=n-1;
        }
        System.out.println();
       }

}

}