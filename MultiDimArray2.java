public class MultiDimArray2 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
            int x=a[i][j]; 
            int y=b[i][j];
            System.out.print(x+y+"   ");
        }System.out.println( );
    }
}
}
