/*
* 7.	FLAMES: Names of two people will be given, you have to find the type of relationship between them, by performing flames calculation.
Ex: Input: Orange Grape
Output: Friendship
* ic
*/

import java.util.Scanner;
class Flames{
    public void putFlame(String s1,String s2){
       StringBuilder remFlame= new StringBuilder();
       char arr1[]=s1.toCharArray();
       char arr2[]=s2.toCharArray();
       for(int i=0;i<arr1.length;i++){
           for(int j=0;j< arr2.length;j++){
               if(arr1[i]==arr2[j] && arr1[i]!=' '){
                   arr2[j]=' ';
                   arr1[i]=' ';
                   break;
               }
               else if((arr1[i]!=' '&& arr2[j]!=' ') && (arr2[j]!=arr1[i])){
                   remFlame.append(arr1[i] + arr2[j]);
                   arr2[j]=' ';
                   arr1[i]=' ';
                   break;
               }
           }
       }
        System.out.println(remFlame);


    }
}

public class Ass7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String s1=sc.next();
        System.out.println();
        System.out.println("Enter the String 2: ");
        String s2=sc.next();
        Flames s=new Flames();
        s.putFlame(s1,s2);
    }
}
