import java.util.Scanner;

public class demo40 {
    public static void main(String[] args) {
        int reminder, modulous, temp, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find if it is an Armstrong number or not");
        int n = scanner.nextInt();
        temp = n;
        while (n > 0) {
            modulous = n % 10;
            n = n / 10; 
            sum = sum + modulous * modulous * modulous;
        }

        if (temp == sum) {
            System.out.print("It is an Armstrong number");
        } else {
            System.out.print("It is not an Armstrong number");
        }
    }
}
