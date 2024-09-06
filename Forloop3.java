public class Forloop3 {
    public static void main(String[] args) {
        // int y = 0;
        // int z = 0;
        // for(int i =1; i<=10; i++){
        //     if (i%2==0) {
        //         y += i;
        //     }
        //     else if(i%2!=0){
        //         z += i;
        //     }
        // }System.out.println("EVEN ADD ="+y);
        //  System.out.println("ODD ADD ="+z);

        // int a[] = {21,22,23,24,25,26,27,28,29,30};
        // int b =((a.length)/2);
        // for(int i = 0; i<b; i++){
        //   int c = 0;
        //   c = a[i];
        //   a[i]  = a[i+b];
        //   a[i+b]  = c;
        // }
        // for(int j=0; j<=9; j++){
        //     System.out.println(a[j]);
        // }
        
          
        int a[] = {21,22,23,24,25,26,27,28,29,30};
        int b =((a.length)/2);
        for(int i = 0; i<b; i++){
         System.out.println(a[i]);
         System.out.println(a[i+b]);
        }
}
}
