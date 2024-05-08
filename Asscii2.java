public class Asscii2 {
    public static void main(String[] args){

        int s=65;
            for (int i=0;i<=6;i++){
                for(int j=0;j<=6-i-1;j++){
                     System.out.print(" ");
                   
                }

                for(int j=0;j<i+1;j++){
                       
                    System.out.print((char)s + " ");
                    s++;
                    if(s==91){
                        break;
                    }
                
                  
                }
                System.out.println();
            
               
            }

    }
}
