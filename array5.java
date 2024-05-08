public class array5 {
    
    public static void main(String[] args) {
        
        System.out.println("copying one array elements to another array");

        int a[]={1,8,4};
        int b[]= new int[a.length]; 
        //mentioning size of the array


        /*
         When you write b = a; in Java, you're not copying the elements from array a to array b as you might expect. 
         Instead, you're telling Java that both a and b should refer to the same array in memory. 
         So, whatever you do to a will also affect b, and vice versa. 
         It's like two nicknames for the same person – changing one will automatically change the other.
         */
        b=a;
       
        a[2]++;
        b[1]++;
        System.out.println("contents of all a[]");
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]+ "");
        }
       System.out.println("Contents of all b[]");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
