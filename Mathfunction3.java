import java.util.Scanner;

public class Mathfunction3 {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        String a[]={"rock","paper","scissor"};
        System.out.println("ENTER USER CHOICE::");
        String b = sacn.next();
        System.out.println("ENTER COMPUTER CHOICE::");
        String c = a[(int)(Math.random()*3)];
        System.out.println(c);
        if (b.equals(c)){
           System.out.println("ITS A TIE!");
        }else if((b.equals("rock") && c.equals("scissor")) ||
                 (b.equals("paper") && c.equals("rock")) ||
                 (b.equals("scissor") && c.equals("paper"))) {
                    System.out.println("YOU WIN!");
        }else if((b.equals("rock") && c.equals("paper")) ||
                 (b.equals("paper") && c.equals("scissor")) ||
                 (b.equals("scissor") && c.equals("rock"))) {
                    System.out.println("YOU LOSE!");
        }else{
            System.out.println("INVALIED INPUT");
        }
                                                   
    }
    
}
