public class pattern12 {
    public static void main(String[] args){

        int s=65;
        for(int i=0;i<5;i++){

            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){

                System.out.print((char) s+ " ");
            }

            s++;
            System.out.println();
        }
    }
    
}
