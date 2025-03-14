import java.util.Arrays;
 
public class ArrayOperations {

     public static void main(String[] args) {

         int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
 
        // Sắp xếp mảng

         Arrays.sort(my_array1);
 
        // Tính tổng và giá trị trung bình

         int sum = 0;

         for (int num : my_array1) {

             sum += num;

         }

         double average = (double) sum / my_array1.length;
 
        // Hiển thị kết quả

         System.out.println("Sorted array: " + Arrays.toString(my_array1));

         System.out.println("Sum: " + sum);

         System.out.println("Average: " + average);

     }

 }