/*11.	Design a Hash Map without using any built-in hash table libraries.
* "c"
* */
import java.util.Scanner;

class HashMap{
    int KeyArr[];
    String ValueArr[];
    int keyP=-1;
    int valueP=-1;
    public void SetLen(int len){
        KeyArr=new int[len];
        ValueArr=new String[len];
    }

   public void AddElement(int a,String b){
       keyP++;
       valueP++;
       KeyArr[keyP]=a;
       ValueArr[valueP]=b;
   }
   public String getValue(int a){
        String ans = null;
        for(int i=0;i< KeyArr.length;i++){
            if(KeyArr[i]==a){
                ans=ValueArr[i];
            }
        }
        return ans;
   }
   public void showMap(){
       for(int i=0;i< KeyArr.length;i++){
           System.out.println("Key: "+KeyArr[i]+"  value:"+ValueArr[i]);

       }
   }

}
public class Ass11 {
    public static void main(String[] args) {
       try {
            int len = 0;
            HashMap hm = new HashMap();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the hashmap: ");
            len = sc.nextInt();
            hm.SetLen(len);
            for (int i = 0; i < len; i++) {
                int key = 0;
                String value = null;
                System.out.println("Enter the " + (i + 1) + " key:");
                key = sc.nextInt();
                System.out.println("Enter the " + (i + 1) + " value:");
                value = sc.next();
                hm.AddElement(key, value);
            }
            hm.showMap();
            int fkey;
            System.out.println("Enter the key to find value: ");
            fkey = sc.nextInt();
            String res = hm.getValue(fkey);
            System.out.println("The value is: " + res);
        }
       catch (Exception e){
           System.out.println("I");
       }

    }
}
