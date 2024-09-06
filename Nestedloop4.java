import java.util.Scanner;

public class Nestedloop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //UPPER
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
             }                                                    //DIAMOND PATTERN.
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
         
    }
    
}


