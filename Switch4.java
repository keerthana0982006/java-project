import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER::");
        int a = scan.nextInt();
        switch (a%2) {
            case 0:System.out.println(a+" IS EVEN");
                
                break;
            case 1:System.out.println(a+" IS ODD");
                
                break;
        
            default:System.out.println("INVALID NUMBER");
                break;
        }
    }
    
}
