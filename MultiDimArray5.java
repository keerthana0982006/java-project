import java.util.Arrays;

public class MultiDimArray5 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
        int d[][] = new int[3][3];
        arr(a,b,d);
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            }System.out.println();
        }
    }public static void arr(int a[][],int b[][],int d[][]) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               d[i][j]  =a[i][j]+b[i][j];
           } 
        }
    }
}
