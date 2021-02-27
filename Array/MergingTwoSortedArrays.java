import java.util.*;

class MergingTwoSortedArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int x = sc.nextInt();
        int[] a = new int[x];
        System.out.println("Enter numbers in a sorted order to store in first array : ");
        for(int i=0;i<x;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array : ");
        int y = sc.nextInt();
        int[] b = new int[y];
        System.out.println("Enter numbers in a sorted order to store in second array : ");
        for(int j=0;j<y;j++)
        {
            b[j] = sc.nextInt();
        }
        int z = x+y;
        int[] c = new int[z];
        int i=0;
        int j=0;
        int k=0;
        while(i<x&&j<y)
        {
            if(a[i]<b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<x)
        {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<y)
        {
            c[k] = b[j];
            j++;
            k++;
        }
        System.out.print("Merged array : ");
        for(int l=0;l<z;l++)
        {
            System.out.print(c[l]+"  ");
        }
    }
}
