import java.util.Scanner;

public class Nestedloop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(+i);
            }System.out.println();
        }

        // System.out.println("ENTER NUMBER");
        // int n = scan.nextInt();
        // for(int i=n; i>=1; i--){
        //     for(int j=n; j>=1; j--){
        //     System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
}
