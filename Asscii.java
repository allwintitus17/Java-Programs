public class Asscii {
    public static void main(String[] args){

      int   s=65;
  
        for (int i=0;i<=4;i++){
            
          for(int j=0;j<4-i-1;j++){
            System.out.print("  ");
          }
               for(int j=0;j<i+1;j++){
                    System.out.print((char) s + "  ");
               }
               s=s+1;
               System.out.println();
              
            }
         
         

        }
  
      

    }
  
