import java.util.Scanner;

//GCD of given two numbers "c"
class Numbers{
    public int gcd(int a,int b){
        int c=0; //to find smaller of given two numbers
        int answer=0; //gcd of the numbers
        if(a<b)  c=a;
        else c=b;
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0) answer=i;
        }
        return answer;
    }
}

public class Ass9 {
    public static void main (String a[]){
        try{
            Numbers ans = new Numbers();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            System.out.println("The GCD of two numbers is " + ans.gcd(number1, number2));
        }
        catch(Exception e) {
            System.out.println("Invalid input");
        }
    }
}
