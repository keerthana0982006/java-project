import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE GENDER::");
        String gender = scan.nextLine();
        if (gender.equals("male")){
            System.out.println("ENTER AGE::");
            int age = scan.nextInt();
            if (age>21) {
                System.out.println("ELIGIBLE FOR ADMISSION");
                System.out.println("ENTER MARK::");
                int mark = scan.nextInt();
                if(mark>75){
                    System.out.println("50% DISCOUNT");
                }
                else if (mark>50) {
                    System.out.println("25% DISCOUNT");
                }
                 else{
                    System.out.println("NO DISCOUNT");
                }  
            }else{
                System.out.println("NOT ELIGIBLE FOR ADMISSION");
            }
           
        }
        if (gender.equals("female")){
            System.out.println("ENTER AGE::");
            int age = scan.nextInt();
            if (age>18) {
                System.out.println("ELIGIBLE FOR ADMISSION");
                System.out.println("ENTER MARK::");
                int mark = scan.nextInt();
                if(mark>75){
                    System.out.println("FULL DISCOUNT");
                }
                else if (mark>50) {
                    System.out.println("50% DISCOUNT");
                }
                else{
                    System.out.println("NO DISCOUNT");
                }
            }else{
                System.out.println("NOT ELIGIBLE FOR ADMISSION");
            }
            
        }



        }
    
   }
