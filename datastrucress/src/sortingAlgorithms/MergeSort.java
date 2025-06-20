//Given an array of elements. Sort the following array using Merge sort Technique.
//
//The first line of the input is the array size. The second line of the input is the array elements.
//
//The following lines of the output are the various passes of the merge sort.
//
//Constraint:
//
//        0<n<50000
//
//Sample Input 1
//
//        6
//
//        45 78 12 49 11 6
//
//Sample Output 1
//
//        45 78 12 49 11 6
//
//        12 45 78 49 11 6
//
//        12 45 78 11 49 6
//
//        12 45 78 6 11 49
//
//        6 11 12 45 49 78
package sortingAlgorithms;
import java.util.*;
public class MergeSort
{
    static int[] arr;
    public static void main(String... jjs)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        arr=mergeSort(arr,0,n-1);
        //  pass(ar);

    }
    private static void pass()
    {
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    private static int[] mergeSort(int[] ar,int st,int end)
    {
        if(st==end)
            return new int[]{ar[st]};
        int mid=(st+end)/2;
        int[] l=mergeSort(ar,st,mid);
        int[] r=mergeSort(ar,mid+1,end);
        int[] mergedd=merge(l,r);
        for(int i=0;i<mergedd.length;i++)
            arr[st+i]=mergedd[i];
        pass();
        return mergedd;

    }
    private static int[] merge(int[] l,int[] r)
    {
        int[] join=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length&&j<r.length)
        {
            if(l[i]<r[j])
                join[k++]=l[i++];
            else
                join[k++]=r[j++];
        }
        while(i<l.length)
            join[k++]=l[i++];
        while(j<r.length)
            join[k++]=r[j++];
        return join;
    }
}