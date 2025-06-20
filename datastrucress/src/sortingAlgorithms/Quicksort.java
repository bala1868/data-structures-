package sortingAlgorithms;

import java.util.Scanner;

import static java.util.Collections.swap;

public class Quicksort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
           ar[i]=scanner.nextInt();
        }
        quickSort(ar,0,n-1);
        printArr(ar);
    }
    private static int partition(int[] ar,int l,int h){
        int i=l+1;
        int pivot=ar[l];
        int j=h;
        while (i<=j){
            while(i<=h&&ar[i]<=pivot)
                i++;
            while(j>l&&ar[j]>pivot)
                j--;
            if(i<j)
                sWapp(ar,i,j);
        }

            sWapp(ar,l,j);
            return  j;

    }

    private static void sWapp(int[] ar, int i, int j) {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }

    private static void quickSort(int[] ar, int l, int h) {
        if(l<h){
            int value=partition(ar,l,h);
        quickSort(ar,l,value-1);
        quickSort(ar, value+1, h);
        }

    }


    public static void printArr(int[] arr)
    {
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
