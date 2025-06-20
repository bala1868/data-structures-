package sortingAlgorithms;//ven an array of elements. Sort the following array elements using Insertion sorting.
//
//First line of the input is no of array elements. Second line of the input is array elements.
//
//The following lines of the output are the various passes of the insertion sort.
//
//Sample Input 1
//
//        8
//
//        20 40 3 11 80 15 8 10
//
//Sample Output 1
//
//        20 40 3 11 80 15 8 10
//        20 40 3 11 80 15 8 10
//        3 20 40 11 80 15 8 10
//        3 11 20 40 80 15 8 10
//        3 11 20 40 80 15 8 10
//        3 11 15 20 40 80 8 10
//        3 8 11 15 20 40 80 10
//        3 8 10 11 15 20 40 80
//
//Sample Input 2
import java.util.Scanner;
public class Insertionsort
{
    public static void main(String[] atshs)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        insertionSort(ar,n);
    }
    private static void insertionSort(int[] ar,int n)
    {
        for(int i=1;i<n;i++)
        {
            printArr(ar);
            int j=i-1,k=ar[i];
            while(j>=0&&ar[j]>k)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=k;
        }
        printArr(ar);
    }
    private static void printArr(int[] ar)
    {
        for(int i:ar)
            System.out.print(i+" ");
        System.out.println();
    }
}