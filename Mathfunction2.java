public class Mathfunction2 {
    public static void main(String[] args) {
        String a[]={"ajay","keerthi","priya","varun","aakash","pavi","aishu","kanna","kumar","saravana"};
        int b=a.length;
        // int c=(int)(Math.random()*b);
        // System.out.println(a[c]);
        for(int i=0;i<=b-1;i++){
            int c=(int)(Math.random()*b);
            System.out.println(a[c]);
        }
    }
    
}
