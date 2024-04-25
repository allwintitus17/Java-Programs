import java.util.Scanner;
public class demo16{

	public static void main(String[] args){

		//FACTORIAL USING THE WHILE LOOP 

		Scanner inp1 =new Scanner(System.in);
		int n=inp1.nextInt();
		int i=1;
		int res=1;

		while(i<=n){

		res*=i;
		i++;
		}
		System.out.println("FACTORIAL FOR GIVEN  NUMBERS IS :"+res);
	}
}