public class array8 {
    public static void main(String[] args) {
        System.out.println("Finding Duplicates");
        int a[]={1,1,2,3,3,4,4,5,5,7,7};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
