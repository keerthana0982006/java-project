import java.util.Scanner;

public class Userdefine5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int a = scan.nextInt();
        SquarePattern(a);
        DiamondPattern(a);
        NumberPattern(a);
    }public static void SquarePattern(int a) {
        System.out.println("SQUARE PATTERN::");
        for(int i=0;i<a;i++){
            for(int j=0; j<a;j++){
                System.out.print("*");
            }System.out.println();
        }
    }public static void DiamondPattern(int a) {
        System.out.println("DIAMOND PATTERN::");
        for(int i=1; i<5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }System.out.println();
             }                                                    
             //LOWER
             for(int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for(int j=5; j>=i; j--){
                    System.out.print("*");
                }
                for(int j=5; j>i; j--){
                    System.out.print("*");
                }System.out.println();
             }
    }public static void NumberPattern(int a) {
        System.out.println("NUMBER PATTERN::");
        for(int i=1; i<5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>1; j--){
                System.out.print(j);          
            }                                                   
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for( int i=5; i>=1; i--){
            for( int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
           System.out.println();
        }
    }
    
}
