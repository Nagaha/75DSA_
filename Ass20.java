//	Find the given target value starting and ending index in the given sorted array.
//        I/O : [ 1,2,3,3,3,4,5,6 ], target =3
//        O/P : [ 2,4 ]
//"C"

import java.util.Arrays;
import java.util.Scanner;
class TargetRange{
    public int[] rangeFinding(int array[],int target,int rangeArray[]){
        Arrays.sort(array); //sorting the given array to make all repeated elements to be neighbors
        int startIndex=0;
        int endIndex=0;
        for(int i=0;i<array.length;i++){
            if(target==array[i] && startIndex==0) { //if we find the target we put its index in start(for first time)
                startIndex=i;
                endIndex=i;//We put end also as i it is for target element appearing only once
            }
            else if(target==array[i]){
                endIndex=i;//When we encounter the second or further times
            }
        }
        int ans[]=new int[2];
        ans[0]=startIndex;
        ans[1]=endIndex;
        System.out.println(ans[0]+" "+ans[1]);
        return ans;
    }
}
public class Ass20 {
    public static void main(String a[]){
        try{
            Scanner sc = new Scanner(System.in);
            TargetRange t = new TargetRange();
            System.out.println("Enter the number of elements in an array:");
            int n = sc.nextInt(); //size of the array
            int[] quesArray = new int[n]; //question array
            int[] answerArray = new int[2]; // resultant array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                quesArray[i] = sc.nextInt();
            }
            System.out.println();
            System.out.println("Enter the target value: ");
            int target = sc.nextInt();
            int ans[]=t.rangeFinding(quesArray, target, answerArray);
            System.out.println("The range of the given target in the array is: " +ans[0]+" "+ans[1]);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
