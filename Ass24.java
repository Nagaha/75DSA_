//Arrange first half in ascending others in descending "c"
import java.util.Scanner;
class Arrange{
    public int[] asecSort(int a,int arr[]){
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a-1;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public int[] descSort(int a,int arr[]){
        for(int i=a;i< arr.length;i++){
            for(int j=i+1;j< arr.length-1;j++){
                int temp=0;
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
public class Ass24 {
    public static void main(String a[]){
        Arrange s=new Arrange();
        System.out.println("Enter the size of the array: ");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the value for "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int resArr[];
        resArr=s.asecSort(size/2,arr);
        resArr=s.descSort(size/2,resArr);
        for(int x:resArr){
            System.out.print(x+" ");
        }


    }
}
