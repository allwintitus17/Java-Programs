public class pattern8 {
public static void main(String[] args){
int s=10;
for(int i=1;i<=10;i++){
   
    for(int j=1;j<=s;j++){
       
        System.out.print(" ");
        
    }
    if(i%2==0){
        for(int k=0;k<i;k++){
     
            System.out.print("# ");
            
        }

    }else{
        for(int k=0;k<i;k++){
     
            System.out.print("* ");
            
        }
    }
 
  

    System.out.println();
  
    s=s-1;
}

}
}
