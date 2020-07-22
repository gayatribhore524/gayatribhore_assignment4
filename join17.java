import java.util.*;  
class join17{  
   public static void main(String args[]){  
    
      ArrayList<String> List=new ArrayList<String>();  
     
      List.add("Delhi");
      List.add("Mumbai");
      List.add("Chennai");
      List.add("Kolkata");
      
      System.out.println("first ArrayList:" +List);
    
      ArrayList<String> arrlist = new ArrayList<String>();
     arrlist.add("pune");
      arrlist.add("latur");

      
      List.addAll(arrlist);
     
      System.out.println("ArrayList after adding  two list :" + List);
   }  
}