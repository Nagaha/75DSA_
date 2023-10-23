//Given number is factorial or not "c"
import java.util.Scanner;

class Solution{
    public int factorial(int n){
        if(n>=100 && n%120==0) return 1;//The factorial after 5 will be the multiple of 120
        else if(n<=2 || n%6==0) return 1;//Before 5 there are only two possibles 2,6
        else return 0;
    }
}

public class Ass8 {
    public static void main(String[] args) {
        Solution answer =new Solution();
        Scanner sc=new Scanner(System.in);
        //Getting inputs from the user
       try {
           System.out.println("Enter a number:");
           int number = sc.nextInt();
           //calls the function with given input
           if (answer.factorial(number) == 1) System.out.println("The number is a factorial number");
           else System.out.println("The number is not a factorial number");
       }
       catch (Exception e){
           System.out.println("Invalid input");
       }
    }
}