package sortingAlgorithms;

import java.util.*;
/*first small element come to 1st*/
public class Selectionsort
{
    public static void main(String... sjs)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int min=ar[i],minin=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<min)
                {
                    min=ar[j];
                    minin=j;
                }
            }
            int t=ar[minin];
            ar[minin]=ar[i];
            ar[i]=t;
            printArr(ar);

        }

    }
    private static void printArr(int[] ar)
    {
        for(int i:ar)
            System.out.print(i+" ");
        System.out.println();
    }
}