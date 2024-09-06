import java.util.Scanner;

public class Mathfunction4 {
    public static void main(String[] args) {
       Scanner sacn = new Scanner(System.in);
        String a[]={"rock","paper","scissor"};
        int user = 0;
        int computer = 0;
        for(int i=0; i<5; i++){
            System.out.println(i+1);
        }
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
                    user++;
        }else if((b.equals("rock") && c.equals("paper")) ||
                 (b.equals("paper") && c.equals("scissor")) ||
                 (b.equals("scissor") && c.equals("rock"))) {
                    System.out.println("YOU LOSE!");
                    computer++;
        }else{
            System.out.println("INVALIED INPUT");
        } 
        if(user>3 || computer<3){
            
        }
        if(user>computer){
            System.out.println("YOU WIN THE GAME!");
        }else if(computer>user){
            System.out.println("COMPUTER WIN THE GAME!");
        }else{
            System.out.println("ITS A TIE");
        }
    
    }
    
}
