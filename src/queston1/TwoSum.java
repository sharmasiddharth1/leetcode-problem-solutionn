package queston1;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class TwoSum {
    public static void main(String[] args) {
        //this is main class
         int [] arr = { 2, 3 , 4, 5, 6, 7, } ;
         int target = 13;
         int [] ans = checksum(arr , target);
         System.out.println(" sum of two array's element which is equal to the target " + arr[ans[0]] + " ,  " + arr[ans[1]] );


    }
    public static int[] checksum (int [] arr , int k ){
        int len;
        len = arr.length ;
         for(int i = 0 ; i < len-1 ; i++  ){
             for(int j = i+ 1 ; j< len ; j++ ){
                if( arr[i] + arr[j] == k  ){
                    int [] result = {i , j}  ;
                    return result;
                }
             }
         }
         return  new int [] {}  ;
    }

}
