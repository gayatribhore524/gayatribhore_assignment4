import java.util.ArrayList;
public class Arraylistempty 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
         
        System.out.println(list.isEmpty());     
         
        list.add("A");
         
        System.out.println(list.isEmpty());   
         
        list.clear();
         
        System.out.println(list.isEmpty());     
    }
}