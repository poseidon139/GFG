// Simple sorting in java with primitive values in array is done with sort() function
//this sort() function cannnot be used to sort the values in decreasing order

package Sorting;

import java.util.Arrays;
//for non primitive we use compareTo function and comparable interface for them.

/**
 * primitiveAndNonPrimitiveSorting
 */
public class primitiveAndNonPrimitiveSorting {

        public static void Sort(){
            int[] arr={10,20,2,3,4,5,90};
            Arrays.sort(arr);
            for(int x: arr){
                System.out.println(x);
            }
        }
        public static void main(String[] args) {
            primitiveAndNonPrimitiveSorting.Sort();
        }
}
