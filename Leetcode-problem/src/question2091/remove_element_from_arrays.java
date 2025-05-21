package question2091;

public class remove_element_from_arrays {
    public static void main(String[] args) {
        int[] arr = {2, 10, 7, 5, 4, 1, 8, 6};
        System.out.println(removeElement(arr));
    }
    public static int removeElement(int [] arr){
        int len = arr.length ;
        if(len == 0 ) {
            System.out.println("empty");
            return -1 ;
        }
        int [] result = FindMaxMin(arr);
        int max = result[0];
        int min = result[1];
        int maxindex = result[2];
        int minindex = result[3];

        int i = Math.min(maxindex , minindex  );
        int j = Math.max(maxindex , minindex );

        int case1 = j + 1  ;
        int case2 = len -i ;
        int case3 = len - j + i + 1;
        int ans;
        ans = Math.min(case1 , Math.min( case2 , case3 ));
        return ans;
    }
    public static int[] FindMaxMin(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxindex = 0 ;
        int minindex = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
                maxindex = i ;
            }
            if(min > arr[i]){
                min = arr[i];
                minindex = i ;
            }
        }
        return new int[] {max , min , maxindex , minindex};
    }



}
