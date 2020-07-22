import java.util.ArrayList;

class arraylist4{
    public static void main(String[] args) {
       
        ArrayList<String> languages = new ArrayList<>();

        
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

       
        int size = languages.size();
        System.out.println("Length of ArrayList: " + size);
    }
}