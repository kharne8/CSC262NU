import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ===== ARRAY SECTION =====
        // Arrays are fixed in size. Once I say 3, it stays 3.
        int[] numsArray = new int[3]; 

        // Filling the array manually by index
        numsArray[0] = 10;
        numsArray[1] = 20;
        numsArray[2] = 30;

        System.out.println("Array contents: " + Arrays.toString(numsArray));
        System.out.println("Array length (fixed): " + numsArray.length);

        // I can change values inside the array...
        numsArray[1] = 99;
        System.out.println("Array after updating index 1: " + Arrays.toString(numsArray));

        // But I CANNOT make it bigger or smaller.
        // If I needed more space, I'd have to create a new array.


        // ===== ARRAYLIST SECTION =====
        // ArrayList is more flexible. It can grow and shrink.
        ArrayList<Integer> numsList = new ArrayList<>();

        // Notice I use Integer, not int.
        // ArrayList works with objects, not primitive types.
        numsList.add(10);
        numsList.add(20);
        numsList.add(30);

        System.out.println("\nArrayList contents: " + numsList);
        System.out.println("ArrayList size (dynamic): " + numsList.size());

        // Adding more elements is super easy.
        numsList.add(40);
        System.out.println("After adding 40: " + numsList);
        System.out.println("ArrayList size now: " + numsList.size());

        // Removing elements is also simple.
        numsList.remove(1); // removes the element at index 1
        System.out.println("After removing index 1: " + numsList);
        System.out.println("ArrayList size now: " + numsList.size());


        // ===== COMPARING ACCESS =====
        // Both use index positions to access elements.
        System.out.println("\nAccessing first element:");
        System.out.println("Array[0] = " + numsArray[0]);
        System.out.println("ArrayList.get(0) = " + numsList.get(0));

        // From what I understand so far:
        // Arrays = simple and fast but fixed size.
        // ArrayList = more flexible but slightly more overhead.
    }
}