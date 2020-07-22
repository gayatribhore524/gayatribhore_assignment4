import java.util.*;  
class array18{  
   public static void main(String args[]){  
    
      ArrayList<Integer> List=new ArrayList<>();  
     
      List.add(2);
      List.add(3);
      List.add(4);
      List.add(5);
      
      System.out.println("first ArrayList:" +List);
    
      ArrayList<Integer> arrlist = new ArrayList<>();
     arrlist.add(11);
      arrlist.add(12);

      
      List.addAll(3,arrlist);
     
      System.out.println("ArrayList after adding  two list :" + List);
   }  
}