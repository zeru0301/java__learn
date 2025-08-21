package learn.lessun02;
import java.util.*;


public class ArrayEasy {

    // 問１
    public static void main(String[] args) {
        
        int Arr[] = {3, 1, 4, 1, 5};
        int i = 0;
        
        for(int num : Arr){
            i += num;
            System.out.println(i);
        } 
        System.out.println("合計は" + i + "です");

        // 問2問

        int[] arr = {2, 4, 6, 8, 10};
        int[] reversed = new int[arr.length];

        for(int i1 = 0; i1 < arr.length; i1++){

            reversed[i1] = arr[arr.length -1 - i1];

        } 

        for(int num1 : reversed){
            System.out.println(num1);
        } 

        // 問題３
        int[] arr2 = {1, 2, 2, 3, 4, 4, 4, 5};

// LinkedHashSet にすると元の順序を保持できます
        Set<Integer> arrayList = new LinkedHashSet<>();

        for(int num2 : arr2){
            arrayList.add(num2);

        }

        System.out.println(arrayList);

    }
}


