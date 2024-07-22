/**
 Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 For example, in an array A:
 Example :
 Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
 Output: 3
 */
public class Z3EquilbriumIdx {
    public static void main(String[] args) {
        int arr[]=new int[]{-7,1,5,2,-4,-3,0};//creating an array with elements
        int ans=findEquilbriumIndex(arr);//calling the function
        System.out.println(ans);
        //output is 3 because at 3rd index both sums are -1
    }

    private static int findEquilbriumIndex(int[] arr) {
        int left=0;//left pointer
        int right=1;//right pointer

        int lsum=0;//Maintains the left sum
        int rsum=0;//Maintains the right sum

        for(int i=1;i<arr.length;i++){
            rsum+=arr[i];//first we find the sum of all elements excluding the first one (rsum)
        }
        if(lsum==rsum) return left;//if rsum is 0 we return left

        while(right<arr.length){

            lsum+=arr[left];//we add element at left index to lsum
            rsum-=arr[right];//we subtract element at right index from rsum
            if (lsum==rsum) return left+1;//incase of getting equilbirium point we return it
            left++;//incrementing the pointers
            right++;

        }
        return -1;//Incase of no equilbrium we return -1
    }
}
