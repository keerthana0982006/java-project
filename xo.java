import java.util.Scanner;

public class xo {
    public static char arr[] ={'-','-','-','-','-','-','-','-','-'};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char p1 = 'x';
        for(int i=0; i<9; i++){
            int a = scan.nextInt();

            if (!display(p1,a)) {
                System.out.println("Wrong move.Position alredy taken.Try again.");
                i--;
                continue;
            }

            show();
            if(result(p1)) {
                System.out.println("Winner is "+p1);
                break;
            }
            p1 = execute(p1);
            if (i==8) {
                System.out.println("The game is draw!");
            }

        }
    }
    public static char execute(char p1) {
        if (p1 == 'x') {
            p1 = 'o';
        }else{
            p1 = 'x';


        }
        return p1;
    }
    public static void show() {
        System.out.println(arr[0]+" | "+arr[1]+" | "+arr[2]);
        System.out.println(arr[3]+" | "+arr[4]+" | "+arr[5]);
        System.out.println(arr[6]+" | "+arr[7]+" | "+arr[8]);  
    }
    public static boolean display(char p1, int i) {
       if (arr[i-1]=='-') {
           arr[i-1]=p1;
           return true;
       }else{
          return false;
       }
    }
    public static boolean result(char p1) {
        if (arr[0]==p1 && arr[1]==p1 && arr[2]==p1 ||
            arr[3]==p1 && arr[4]==p1 && arr[5]==p1 ||
            arr[6]==p1 && arr[7]==p1 && arr[8]==p1 ||

            arr[0]==p1 && arr[3]==p1 && arr[6]==p1 ||
            arr[1]==p1 && arr[4]==p1 && arr[7]==p1 ||
            arr[2]==p1 && arr[5]==p1 && arr[8]==p1 ||

            arr[0]==p1 && arr[4]==p1 && arr[8]==p1 ||
            arr[2]==p1 && arr[4]==p1 && arr[6]==p1 ){
                return true;
            }else{
                return false;
            }
        }
    }  
    
    

