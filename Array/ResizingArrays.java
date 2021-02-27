import java.util.*;

class ResizingArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers to store in array : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter new size of array : ");
        int c = sc.nextInt();
        int[] temp = new int[c];
        for(int j=0;j<n;j++)
        {
            temp[j] = a[j];
        }
        a = temp;
        System.out.print("Your resized array looks like : ");
        for(int k=0;k<c;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
