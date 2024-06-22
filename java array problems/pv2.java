import java.util.Scanner;
public class pv2{

    public static void main(String[] args) {
        System.out.println("charecter and number counter from string");
        int lettercount=0;
        int numbercount=0;
        int specialcharcount=0;
        String string;
        Scanner sc = new Scanner(System.in);
        string=sc.nextLine();
        for(int i=0;i<string.length();i++){

            char ch=string.charAt(i);
            if(isLetter(ch)) 
            lettercount++;
            else if(isNumber(ch)) 
            numbercount++;
            else 
            specialcharcount++;
           /* if(isspecial(ch)) 
            specialcharcount++;*/ 
        }
        System.out.println(lettercount);
        System.out.println(numbercount);
        System.out.println(specialcharcount);
    }
    public static boolean isLetter(char ch){
       ch=Character.toLowerCase(ch);
        return (ch>='a' && ch<='z');
    }
    public static boolean isNumber(char ch){

        return (ch>='0' && ch<='9');
    }
   /*  public static boolean isspecial(char ch){
        ch=Character.toLowerCase(ch);
        return (ch!='0' && ch!='9' && ch!='a' && ch!='z');

    }*/
}