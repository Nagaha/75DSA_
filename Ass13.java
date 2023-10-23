//majority element in the array "C"

import java.util.Arrays;
import java.util.Scanner;

class Majority{
    public int findMajority(int arr[]){
        Arrays.sort(arr);//The array is sorted
        return arr[arr.length/2+1];//Returns the element which is at n/2+1 th position
    }
}
public class Ass13 {
    public static void main(String a[]){
        Majority s=new Majority();
        Scanner sc=new Scanner(System.in);
        //Getting inputs from the user
        try{
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int array[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("The element which occurs n/2 times is: " + s.findMajority(array));
            //The function is called
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }

    }
}
