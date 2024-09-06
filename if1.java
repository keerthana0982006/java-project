import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER MARK::");
        int a = scan.nextInt();
        if (a>=90) {
            System.out.println("A GRADE");   
        }
        else if(a>=80) {
            System.out.println("B GRADE");
        }
        else if (a>=70) {
            System.out.println("C GRADE");
        }
        else if (a>=60) {
            System.out.println("D GRADE");
        }
        else if (a>=50) {
            System.out.println("E GRADE");
        }
        else{
            System.out.println("FAIL");
            }
    }
}