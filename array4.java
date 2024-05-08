
public class array4 {

    public static void main(String[] args) {

        System.out.println("Summ of arrays");
        int sum = 0;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
