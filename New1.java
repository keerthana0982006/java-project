import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        char board[] = {'-','-','-','-','-','-','-','-','-'};
        int b = 3;
        int c = scan.nextInt();
        //char z = 'x';
         char z = scan.next().charAt(0);
         char b1 = player(z);
         System.out.println(b1);
       main(board,b,z,c);
       display(board,b,z);
       player(z);
    } 
    public static void display(char board[],int b,char z) {
       for(int i=0;i<b;i++){
        for(int j=0;j<b;j++){
            System.out.print(board[i]);
        }
        System.out.println();
     }
    }
    public static char player(char z) {
        if (z == 'x') {
            z = 'o';
        }else{
            z = 'x';
        }
        return z;
    }
    public static void main(char board[],int b,char z,int c) {
        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                
            }
        }
    }
    
}
