import java.util.*;

class ReverseArray
{
    void printArray(int[] b)
    {
        System.out.print("Your array = ");
        for(int j=0;j<b.length;j++)
        {
            System.out.print(b[j]+" ");
        }
        System.out.println();
    }
    
    void reverseArray(int[] c)
    {
        System.out.print("Your reverse array = ");
        int start = 0;
        int end = c.length-1;
        while(start<end)
        {
            int temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        for(int k=0;k<c.length;k++)
        {
            System.out.print(c[k]+" ");
        }
    }
    
    public static void main(String args[])
    {
        ReverseArray x = new ReverseArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers to store in an array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x.printArray(a);
        x.reverseArray(a);
    }
}
