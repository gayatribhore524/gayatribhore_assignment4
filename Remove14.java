import java.util.ArrayList;
public class Remove14 {
   public static void main(String args[]) {
      
       ArrayList<String> al = new ArrayList<String>();
       al.add("A");
       al.add("B");
       al.add("C");
       al.add("D");
       al.add("E");
       al.add("F");
       System.out.println("ArrayList before remove:");
       for(String var: al){
           System.out.println(var);
       }
      
       al.remove("A");
       System.out.println("ArrayList After remove:");
       for(String var2: al){
           System.out.println(var2);
       } 
   }
}