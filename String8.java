public class String8 {
    public static void main(String[] args){
        int count=0;
        String s1="Lakshana";
        for(int i=0;i<s1.length();i++){
                char c1=s1.charAt(i);
            if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u')){
                   count++;
            }
        }
        System.out.println(count);
    }
}
