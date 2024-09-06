import java.util.Arrays;
public class Arraymethod1 {
    public static void main(String[] args) { 
        int a[] = { 10, 25, 16, 22, 39 };
        Arrays.sort(a);
        int b = a.length;
        int c[]=new int[b];
        int j=0;
        for(int i=b-1; i>=0; i--){
            c[j]=a[i]; 
            j++;          
        }
        System.out.println(Arrays.toString(a)); 
        System.out.println(Arrays.toString(c)); 
        // for(int i=a.length-1; i>=0; i--){
        //     System.out.println(a[i]);
        // }  
       
    } 
    
}
