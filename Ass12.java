//To check whether two strings are permutation of each other "c"
import java.util.Arrays;
import java.util.Scanner;

class Check{
    public boolean isAnagram(String s1, String s2){
        int count=0;
       char temp1[]=s1.toCharArray();//Converting string to character array
       char temp2[]=s2.toCharArray();
       Arrays.sort(temp1);//Sorting the character array
       Arrays.sort(temp2);
       for(int i=0;i<temp1.length;i++){
           if(temp1[i]==temp2[i]) count++;//Comparing with each element in the next string
       }
       if(count==s1.length()) return true;//Checking the count value has all matching elements
       else return false;
    }
}

public class Ass12 {
    public static void main (String a[]){
        try{
            Scanner sc = new Scanner(System.in);
            Check c = new Check();
            System.out.println("Enter two strings: ");
            String string1 = sc.next();
            String string2 = sc.next();
            if (c.isAnagram(string1, string2) == true)
                System.out.println("The given strings are anagrams");
            else System.out.println("The given strings are not anagrams");
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
}
