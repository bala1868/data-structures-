package sortingAlgorithms;

import java.util.*;

/*in bubble sort first big element swap to last*/
public class Bubblesort
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
            pass(ar);
        }
        pass(ar);
    }
    private static void pass(int[] ar)
    {
        for(int i:ar)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}