import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            System.out.println(a +" ");
        }
        System.out.print("\n");
        Arrays.sort(arr);
        for(int b:arr){
            System.out.println(b +" ");
        }
        if(arr[1]!=arr[0]){
            System.out.print("The second largest element is"+arr[1]);
    }
}
