package SearchingAlgorithms;

import java.util.Scanner;
///the array should be sorted is compulsory any des/asc
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=scanner.nextInt();
        }
        int st=0;
        int end=n-1;
        boolean a=false;
        int target=scanner.nextInt();
        while(st<end)
        {
            int mid=(st+end)/2;
            if(ar[mid]==target)
            {
                a=true;
                System.out.println("element found at pos"+mid);
                break;
            }
            else if(target>ar[mid])
            {
                st=mid+1;
            }
            else
                end=mid-1;


        }
        if(!a)
        {
            System.out.println("No element found");

        }
    }
}
