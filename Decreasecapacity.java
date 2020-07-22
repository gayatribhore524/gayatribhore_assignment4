import java.util.ArrayList; 
  
public class Decreasecapacity { 
    public static void main(String[] args) 
    { 
  
        
        ArrayList<Integer> array = new ArrayList<Integer>(9); 
  
        
        array.add(2); 
        array.add(4); 
        array.add(5); 
        array.add(6); 
        array.add(11); 
  
         
        array.trimToSize(); 
      
  
        System.out.println("The List elements are:"); 
  
        
        for (Integer number : array) { 
            System.out.println("Number = " + number); 
        } 
    } 
} 