/*"Find the squares of a sorted array
https://www.geeksforgeeks.org/sort-array-converting-elements-squares/*/
import java.util.*;
class sortedarray{
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,12,13,15,18};
        int squarearr[]=new int[arr.length];
        for(int i=0; i<arr.length;i++){
            
            squarearr[i]=(arr[i]*arr[i]);
            
        }
        for(int i=0;i<squarearr.length;i++){
            System.out.print(squarearr[i]+" ");
        }
    }
}


/*Sum of Unique elements
https://leetcode.com/problems/sum-of-unique-elements/"*/

class uniqueelemrnt{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6};
        int n = arr.length;
        Arrays.sort(arr);
        int sum = arr[0];
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum = sum + arr[i+1];
            }
        }
        System.out.println(sum);
 
    }
}