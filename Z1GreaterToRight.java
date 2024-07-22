import java.util.Arrays;

/**
  Replace every element with the greatest element on right side
 Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array.
 Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2},
 then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class Z1GreaterElementToRight {
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,4,3,5,2};//Declaring the array
        replaceGreater(arr);//Function call
        System.out.println(Arrays.toString(arr));
    }

    private static void replaceGreater(int[] arr) {//Function definition

        for(int i=0;i<arr.length;i++){//loop 1 runs through all the elements of the array
            int max=0;//we create max number each time for each element of the array
           for(int j=i+1;j<arr.length;j++){//loop 2 runs through all the elements next to i th element
               max=Math.max(arr[j],max);//finds the max at each time
           }
           arr[i]=max;//at last updates the i th element with next greater element in right side
        }
        arr[arr.length-1]=-1;//for the last element we put it as -1
    }
}
