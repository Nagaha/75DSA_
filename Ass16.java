//Sum of the divisors "c"
import java.util.Scanner;

class Divisors{
    public int findSum(int n){
        int count=0;//To find the sum of the divisors
        for(int i=1;i<=n/2;i++){ //iterating till the n/2 since there will be no divisor after that
            if(n%i==0){
                count+=i;
            }
        }
        return count+n; //it is counted till n/2 so adding the n here as it is also a divisor
    }
}
public class Ass16 {
    public static void main(String[] args) {
        try{
            Divisors s = new Divisors();
            System.out.println("Enter a number to find divisors: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("The sum of the divisors is " + s.findSum(x));
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
