import java.util.ArrayList;
import java.util.List;
public class Retrive16 {

 public static void main(String a[]){
     ArrayList<String> al = new ArrayList<String>();
     al.add("nilanga");
     al.add("osmanabad");
     al.add("dheli");
     al.add("latur");
     al.add("mumbai");
     al.add("pune");

     System.out.println("Original ArrayList Content: "+al);
     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
     System.out.println("SubList stored in ArrayList: "+al2);
     List<String> list = al.subList(1, 4);
     System.out.println("SubList stored in List: "+list);
  }
}