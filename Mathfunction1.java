import java.util.Scanner;

public class Mathfunction1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUM1::");
        int a=scan.nextInt();
        System.out.println("ENTER NUM2;:");
        int b=scan.nextInt();
        System.out.println("max num = " +Math.max(a,b));
        System.out.println("min num = " +Math.min(a,b));
    }
    
}
