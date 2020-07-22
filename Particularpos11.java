import java.util.ArrayList;
import java.util.Arrays;
 class Particularpos11
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
         list.add(12);
         list.add(11);
         list.add(10);
         list.add(15);

       System.out.println("list befor adding element="+list);
       list.add(32);
      System.out.println("list after adding element="+list);
    }
}