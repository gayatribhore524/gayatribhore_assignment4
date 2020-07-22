import java.util.ArrayList;

public class ArrayListMethods {

public static void main(String[] args) {
ArrayList<Integer> aList = new ArrayList<Integer>();

aList.add(5);
aList.add(11);
aList.add(17);
System.out.println("Integer Number Added in ArrayList= " + aList);
ArrayList<String> sList = new ArrayList<String>();
sList.add("Learning");
sList.add("JAVA");
System.out.println("String Added in ArrayList= "+ sList);
aList.add(2,25);
 System.out.println("Integer List After 25 added at index 2 = " + aList);
 
 boolean flag1 =  aList.contains(5);
        if (flag1 == true) {
            System.out.println("aList contains element 5");
        }else{
            System.out.println("aList doesn't contains element 5");
        }
 aList.ensureCapacity(20);

        System.out.println("Array List Number = " + aList);
int value = aList.get(2);
        System.out.println("Element Retrieved at index 2 i.e. 3rd position = " + value);
 System.out.println("String ArrayList = " + aList);

    

        aList.remove(2);
        System.out.println("ArrayList After Removing Element at index 2= "+ aList);
  aList.set(2,333);
        System.out.println("The ArrayList after setting 333 value at index 2:" + aList);

System.out.println("Size of Arraylist is :" + aList.size());
 ArrayList<Integer> arr = new ArrayList<Integer>();

       
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        
        System.out.println("ArrayList= "+arr);

    
        Object[] object = aList.toArray();
       
        for(int i=0;i<object.length;i++){
        System.out.println("Value at index "+i+" of Array coverted from ArrayList= "+object[i]);
        }
         aList.trimToSize();

        System.out.println("Printing an ArrayList after using trimToSize method "+aList);
 aList.clear();
        System.out.println("Printing aList element after using clear method= "+aList);
        System.out.println("size of aList1 after clear() method= " + aList.size());

}

}