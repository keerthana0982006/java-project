import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("ENTER::");
       char a = scan.next().charAt(0);
       if (a>='0' && a<='9') {
        System.out.println("it is a number");
       }
       else if (a>='a' && a<='z') {
        System.out.println("it is a alphapet");
       }
       else{
        System.out.println("it is a special character");
       }
    // System.out.println("ENTER a");
    // int a = scan.nextInt();
    // System.out.println("ENTER b");
    // int b = scan.nextInt();
    // System.out.println("ENTER c");
    // int c = scan.nextInt();
    // if (a>b && a>c) {
    //     System.out.println("a IS THE FIRST GREATEST NUMBER");
    //     if (b<a && b>c) {
    //         System.out.println("b IS THE SECOND GREATEST NUMBER");
    //         System.out.println("c IS THE SMALLEST NUMBER");
    //     }else{
    //         System.out.println("c IS THE SECOND GREATEST NUMBER");
    //         System.out.println("b IS THE SMALLEST NUMBER");
    //     }
    // }
    // else if (b>a && b>c) {
    //     System.out.println("b IS THE FIRST GREATEST NUMBER");
    //     if (a<b && a>c) {
    //         System.out.println("a IS THE SECOND GREATEST NUMBER");
    //         System.out.println("c IS THE SMALLEST NUMBER");
    //     }else{
    //         System.out.println("c IS THE SECOND GREATEST NUMBER");
    //         System.out.println("a IS THE SMALLEST NUMBER");
    //     }
    // }
    // else {
    //     System.out.println("c IS THE FIRST GREATEST NUMBER");
    //     if (b>a && b<c) {
    //         System.out.println("a IS THE SECOND GREATEST NUMBER");
    //         System.out.println("b IS THE SMALLEST NUMBER");
    //     }else{
    //         System.out.println("b IS THE SECOND GREATEST NUMBER");
    //         System.out.println("a IS THE SMALLEST NUMBER");
    //     }
    // }






    }
    
}
