public class array9{

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        //int min = a[3]; // Initialize min to the first element of the array
        int max=a[3];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

System.out.println("Minimum Element Found: " + max);
// System.out.println("Minimum Element Found: " + min);
    }
}
