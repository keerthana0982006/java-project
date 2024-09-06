import java.util.Scanner;

public class Logical1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE GENDER::");
        String GENDER = scan.next();
        if (GENDER.equals("MALE")) {
            System.out.println("ENTER AGE::");
            int AGE = scan.nextInt();
            if (AGE>=12 && AGE<=18) {
                System.out.println("ENTER THE BLOOD LEVEL::");
                float BL = scan.nextFloat();
                if (BL>=13.0 && BL<=16.0) {
                    System.out.println("NORMAL");
                }else{
                    System.out.println("ABNORMAL");
                }
            }else if (AGE>18) {
                System.out.println("ENTER THE BLOOD LEVEL::");
                float BL = scan.nextFloat();
                if (BL>=13.6 && BL<=17.7) {
                    System.out.println("NORMAL");
                }else{
                    System.out.println("ABNORMAL");
                }
            }
        }

         
       if (GENDER.equals("FEMALE")) {
            System.out.println("ENTER AGE::");
            int AGE = scan.nextInt();
            if (AGE>=12 && AGE<=18) {
                System.out.println("ENTER THE BLOOD LEVEL::");
                float BL = scan.nextFloat();
                if (BL>=12.0 && BL<=16.0) {
                    System.out.println("NORMAL");
                }else{
                    System.out.println("ABNORMAL");
                }
            }else if (AGE>18) {
                System.out.println("ENTER THE BLOOD LEVEL::");
                float BL = scan.nextFloat();
                if (BL>=12.1 && BL<=15.1) {
                    System.out.println("NORMAL");
                }else{
                    System.out.println("ABNORMAL");
                }
            }
        }

      











    }
}

