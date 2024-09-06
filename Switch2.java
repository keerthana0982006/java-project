import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUM 1::");
        int a = scan.nextInt();
        System.out.println("ENTER NUM 2::");
        int b = scan.nextInt();
        System.out.println("ENTER SYMBOL::");
        char c = scan.next().charAt(0);
        switch (c) {
            case '+':System.out.println("ADD = "+(a+b));
                break;
            case '-':System.out.println("SUB = "+(a-b));
                break;
            case '*':System.out.println("MULTIPLY = "+(a*b));
                break;
             case '/':System.out.println("DIVIDE = "+(a/b));
                break;
            case '%':System.out.println("MODULE = "+(a%b));
                break;    
            default:System.out.println("NO RESULT");
                break;
        }
    }
    
}
