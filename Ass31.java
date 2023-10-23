//Sentence Reversal using stack "ic"
import java.util.Scanner;
class Stack{
//    public void pop(int top,char array[]){
//        System.out.println(array[top]); //stack pop function in array
//    }
    public void pop(String array[]){
        for(int i=array.length;i>=0;i--){
            System.out.println(array[i]+" ");
        }
    }
}
public class Ass31 {
    public static void main(String a[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string: ");
            String s = sc.next();
           String[] stackArray = new String[]{}; //storing a string in a sorted array
            int j=0;
            System.out.println("The reversed string is: ");
            String temp="";
            for(int i=0;i<s.length();i++){
                char x=s.charAt(i);
                if(x==' '){
                    stackArray[j]=temp;
                    j++;
                    temp="";
                }
                
            }
            Stack answer = new Stack();
//            for (int i = stackArray.length - 1; i >= 0; i--) { //printing from the top element by reverse traversing
//                answer.pop(i, stackArray);
//            }

        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
