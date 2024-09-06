import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER::");
        String a = scan.next();
        switch (a) {
            case "Keerthana":System.out.println("Name  = Keerthana");
                             System.out.println("Phone = 9846725324");
                             System.out.println("email = kee@gmail.com");
                break;
            case "Ajay":System.out.println("Name  = Ajay");
                        System.out.println("Phone = 9483653789");
                        System.out.println("email = Aja@gmail.com");
                break;
            case "Priya":System.out.println("Name  = Priya");
                         System.out.println("Phone = 7639435285");
                         System.out.println("email = pri@gmail.com");
                break;
                case "Varun":System.out.println("Name  = Varun");
                             System.out.println("Phone = 9397563924");
                             System.out.println("email = var@gmail.com");
                break;
                case "Kanna":System.out.println("Name  = Kanna");
                             System.out.println("Phone = 9836245324");
                             System.out.println("email = kanna@gmail.com");
                break;
                case "Jai":  System.out.println("Name  = Jai");
                             System.out.println("Phone = 9936285324");
                             System.out.println("email = jai@gmail.com");
                break;
                case "Kavitha":System.out.println("Name  = Kavitha");
                               System.out.println("Phone = 7703628745");
                               System.out.println("email = kavi@gmail.com");
                break;
                case "Sowmi":System.out.println("Name  = Sowmi");
                             System.out.println("Phone = 9275983426");
                             System.out.println("email = sow@gmail.com");
                break;
                case "Manoj":System.out.println("Name  = Manoj");
                             System.out.println("Phone = 9368265974");
                             System.out.println("email = mano@gmail.com");
                break;
                case "Pavi": System.out.println("Name  = Pavi");
                             System.out.println("Phone = 7383539212");
                             System.out.println("email = pavi@gmail.com");
                break;
        
            default:System.out.println("NO RESULT");
                break;
        }
    }
    
}
