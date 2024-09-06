import java.util.Scanner;;
public class Arrayloop4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("ENTER NUMBER");
       int num = scan.nextInt();
       int i = 1;
       while (i<=10) {
        System.out.println(num+  " * "  +i  +" = " +num*i);
        i++;
       } 
    }
    
}
