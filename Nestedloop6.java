import java.util.Scanner;

public class Nestedloop6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i=1; i<5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>1; j--){
                System.out.print(j);          //                  DIAMOND NUMBER PATTERN
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
