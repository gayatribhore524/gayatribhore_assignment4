import java.util.ArrayList;
import java.util.Arrays;
class Arraylist7
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("gayatri", "nivedita", "priti","poonam","sandhya","sakshi","dipali","nikita"));
         
        int firstIndex = list.indexOf("gayatri");
         
        System.out.println(firstIndex);
         
        int lastindex = list.lastIndexOf("nikita");
         
        System.out.println(lastindex);
    }
}