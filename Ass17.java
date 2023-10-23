//	Find the sum of perfect numbers between the given range
// where perfect number is defined as the number which is divisible by its own digits.
import java.util.Scanner;
class Number{
    public boolean isPerfectNumber(int n){
        int count=0; //counting the digits
        int temp=0; //temporary variable to store the digits
        int check=0; //to count the digits dividing the own number
        int copy=n; // copy of the number
        while(n>0) {
            temp = n % 10; //extracting digits
            count++;
            n = n / 10;
            if(temp==0 || copy%temp==0) check++;
        }
        if(check==count) return true;
        else return false;
    }
}

public class Ass17 {
    public static void main(String arg[]){
        try{
            Scanner sc = new Scanner(System.in);
            Number num = new Number();
            System.out.println("Enter the lower range: ");
            int a = sc.nextInt(); //lower range
            System.out.println("Enter the higher range");
            int b = sc.nextInt(); //higher range
            int sum = 0; //Sum of the perfect numbers
            for (int i = a; i <= b; i++) {
                //to check whether it is perfect number or not
                if (num.isPerfectNumber(i) == true) {  // if it is perfect number
                    sum += i;
                } else sum += 0;
            }
            System.out.println("The sum of the numbers in the given range " + a + " to " + b + " is " + sum);
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
