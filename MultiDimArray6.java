public class MultiDimArray6 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
        int c[][] = new int[3][3];
        arr(a,b,c);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.println(c[i][j]);
            }
        }
    }public static void arr(int a[][],int b[][],int c[][]) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]  =a[i][j]+b[i][j];

            }
        }
    }
    
}
