/*Find the maximum number that can be formed from the given array of numbers, without separating
        the digits.
        Ex: Input: 5 6 34 5 23 9
        Output: 9653423
        incomplete
 */

import java.util.Scanner;
class Maxnum {
    public int nextDigit(int a) {
        int dig=0;
       for(int i=0;i<a;i++){
           if(Math.pow(10,i)<a && Math.pow(10,i+1)>a){
               dig=(int)Math.pow(10,i);
           }
       }
       return dig;
    }
    public int maxNum(int arr[]) {
        int max = 0;
        int temp1 = 0;
        int temp2=0;
        for (int i = 0; i < arr.length; i++){
            for(int j=0;j< arr.length;j++){
                if(i!=j){
                    temp2=arr[i]*(nextDigit(j));
                    temp1+=temp2+arr[j];
                }
            }
            max=Math.max(temp1,max);
        }
        return max;
    }
}
public class Ass3{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        Maxnum s=new Maxnum();
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The greatest number is: "+s.maxNum(arr));
    }
}
