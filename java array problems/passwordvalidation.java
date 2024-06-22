import java.util.Scanner;

public class passwordvalidation{

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("Password Validator");
      String password;
      System.out.println("Enter the password for validation:");
      password=sc.nextLine();

      if(is_valid(password)){
        System.out.println("the password is valid!!");
      }
      else{
        System.out.println("the password is in valid");
      }
}

public static boolean is_valid(String password){
if(password.length()<8)
  return false;

  int numcount=0;
  int charcount=0;
  for(int i=0;i<password.length();i++){

    char ch=password.charAt(i);
    if(isNumeric(ch)) numcount++;
    else if(isletter(ch))  charcount++;
    else return false;

  }

return (charcount>=2 && numcount>=2);


}

public static boolean isletter(char ch){

  ch=Character.toUpperCase(ch);


  return (ch>='A' && ch<='Z');
}

public static boolean isNumeric(char ch){

  return(ch>='0' && ch<='9');
}

}