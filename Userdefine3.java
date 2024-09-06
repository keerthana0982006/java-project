import java.util.Scanner;

public class Userdefine3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ENTER NUMBER::");
        int b = scan.nextInt();
        String c = "absent";
        arr(a,b,c);

    }public static void arr(int a[],int b,String c) {
        for(int i=0;i<a.length;i++){
          if (a[i]==b) {
           c="present";
        }
    }System.out.println(c);
    
}
}
