public class Stringfunction1 {
    public static void main(String[] args) {
       String a = "Patience is the key element to success";
      String b = " ";
      String [] a1 = a.split(b);
      int last=a1.length-1;
      System.out.println(a1[last].length());
      for(String s:a1){
        System.out.println(s);
    }
    }
    
}
