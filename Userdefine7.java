import java.util.Scanner;

public class Userdefine7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER::");
        int a = scan.nextInt();
        HallowSquare(a);
        HallowTriangle(a);
        Diamond(a);
    }public static void HallowSquare(int a) {
        System.out.println("HALLOW SQUQRE::");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if (i==1 || j==1 || i==a || j==a) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }public static void HallowTriangle(int a) {
        System.out.println("HALLOW TRIANGLE::");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=9;j++){
               if (i+j==6 || j-i==4 || i==a) {
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
            }System.out.println();
        }
    }public static void Diamond(int a) {
        System.out.println("DIAMOND::");
        for(int i=1; i<a; i++){
            for(int j=a; j>=i; j--){
                System.out.print(j);
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){         //UPPER
                System.out.print(" ");
            }
            for(int j=i; j<=a; j++){
                System.out.print(j);
            }  
            System.out.println();
          }
        for(int i=a; i>=1; i--){
            for(int j=a; j>=i; j--){
                System.out.print(j);
            }
            for(int j=i; j>1; j--){
                System.out.print(" ");       //LOWER
            }
            for(int j=i; j>1; j--){
                System.out.print(" ");
            }
            for(int j=i; j<=a; j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    
}
