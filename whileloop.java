import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = scan.nextInt();
        int i = 1;
        int a=n;
        while (i<=n*n) {
            System.out.print(a);                             //55555
            if (i%n==0) {                                    //44444
            System.out.println();                            //33333
            a++;                                             //22222
            }                                                //11111
            i++;
            
        }

        // reverse method

        // while (i<=n*n) {
        //     System.out.print(a+" ");
        //     if (i%n==0) {
        //     System.out.println();
        //     a--;
        //     }
        //     i++;
            
        //  }
        
        
       

    
}
}
    
