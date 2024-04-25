import java.util.Scanner;

public class demo17 {

    public static void main(String[] args) {
        int num, reversenum = 0, reminder;
        Scanner inp2 = new Scanner(System.in);
        num = inp2.nextInt();
        while (num != 0) {
            reminder = num % 10;
            reversenum = reversenum * 10 + reminder;
            num = num / 10; // Update the value of num
        }
        System.out.println(reversenum);
    }
}
