import java.util.Scanner;

public class Userdefine6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 5;
        HallowDiamond(a);
    }public static void HallowDiamond(int a) {
        System.out.println("HALLOW DIAMOND::");
        for(int i=1;i<=a;i++){
             for(int j=1;j<=9;j++){
                if (i+j==6 || j-i==4) {
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
             }System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=9;j++){
               if (i+j==6 || j-i==4) {
                   System.out.print(i);
               }else{
                   System.out.print(" ");
               }
            }System.out.println();
        }

    }
    
}
