import java.util.ArrayList; 
import java.util.Scanner;
  
class Presentelement6{ 
    public static void main(String[] args) 
    { 
  
        
        ArrayList<String> arr = new ArrayList<String>(4); 
   
       
        arr.add("java"); 
        arr.add("programming"); 
        arr.add("language"); 
  
       Scanner s=new Scanner(System.in);
      int res=s.nextInt();
if(arr.contains(res))
{
System.out.println("arraylist contains="+res);
}
else
{
System.out.println("arraylist does not contains="+res);
}

    } 
} 