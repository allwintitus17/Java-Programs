public class String9 {
public static void main(String[] args) {
    System.out.println("Check Wheather the String is palindrome or not");
     String s2="";
    String s1=new String("TENET");
    System.out.println(s1);
    for(int i=s1.length()-1;i>=0;i--){

       char c1=s1.charAt(i);
       s2=s2+c1;
       System.out.println(s2);
     

       
    }
    if(s1.equals(s2)){
        System.out.println("it is  a palindrome");
    
       }
       else{
        System.out.print("it is  not a palindrome");
       }
}
}
