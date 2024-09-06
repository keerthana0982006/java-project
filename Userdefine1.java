import java.util.Scanner;

public class Userdefine1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER1::");
        int a = scan.nextInt();
        System.out.println("ENTER NUMBER2::");
        int b = scan.nextInt();
       ADD(a,b);
       SUB(a,b);
       MUL(a,b);
       DIV(a,b);
       MOD(a,b);
    }public static void ADD (int a , int b) {
        int c = a+b;
        System.out.println("SUM = "+(c));
    }public static void SUB (int a , int b) {
        int d = a-b;
        System.out.println("SUB = "+(d));
    }public static void MUL (int a , int b) {
        int e = a*b;
        System.out.println("MUL = "+(e));
    }public static void DIV (int a , int b) {
        int f = a/b;
        System.out.println("DIV = "+(f));
    }public static void MOD (int a , int b) {
        int g = a%b;
        System.out.println("MOD = "+(g));
    }
}
