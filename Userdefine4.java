import java.util.Scanner;

public class Userdefine4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[]={11,12,13,14,15,16,17,18,19,20};
        System.out.println("ENTER NUMBER:");
        int b = scan.nextInt();
        arr(a,b);
    }public static void arr(int a[],int b) {
        for (int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++)
            if (a[i]+a[j]==b) {
                System.out.println("NUM1 = "+a[i]+ " NUM2 = "+a[j]);
               
            }
        }
    }
}