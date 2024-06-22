import java.util.*;
class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        System.out.println("The maximum element is "+b[n-1]);
        System.out.println("The minimum element is "+b[0]);
    }
}
