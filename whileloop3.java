import java.util.Scanner;
public class whileloop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("ENTER NUMBER");
        // int a = scan.nextInt();
        // while (a!=0) {
        //     a = scan.nextInt();
        // }

        System.out.println("ENTER::");
        String a = scan.next();
        while (!a.equals("stop")) {
            a = scan.next();
        } 
    }
}
