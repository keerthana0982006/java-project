import java.util.Scanner;

public class Stringfunction4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER WORD");
        String a=scan.next();
        String b1="";
        String []a1=a.split("");
        for(int i=a1.length-1; i>=0;i--){
            char b=a.charAt(i); 
            b1+=b;
         }if(a.equals(b1)){
                System.out.println("IT IS A POINDROME");
            }else{
                System.out.println("NOT A POLINDROME");
            }
        
        
        
        }

        }
    
    
    

