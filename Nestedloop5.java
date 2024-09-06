import java.util.Scanner;

public class Nestedloop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }System.out.println();
        }
    
          // for(int i=1; i<=5; i++){
          //   for(int j=1; j<=i; j++){
          //       System.out.print(" ");
          //   }
          //   for(int j=5; j>1; j++){
          //       System.out.print(j);
          //   }System.out.println();
          // }
}
}
       