package sortingAlgorithms;

import java.util.Scanner;

public class MergeSortInplace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=scanner.nextInt();
        mergesort(ar,0,n-1);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    private static void mergesort(int[] ar, int st, int end) {
        if(st==end)
            return;
        int mid=(st+end)/2;
        mergesort(ar,st,mid);
        mergesort(ar,mid+1,end);
        mergeinplace(ar,st,end,mid);
    }

    private static void mergeinplace(int[] ar, int st, int end, int mid) {
        int[] joine=new int[end-st+1];
        int i=st,j=mid+1,k=0;
        while(i<=mid&&j<=end)
        {
            if(ar[i]<ar[j])
                joine[k++]=ar[i++];
            else
                joine[k++]=ar[j++];
        }
        while (i<=mid)
            joine[k++]=ar[i++];
        while (j<=end)
            joine[k++]=ar[j++];
        for( i=0;i<joine.length;i++)
            ar[i+st]=joine[i];
    }
}
