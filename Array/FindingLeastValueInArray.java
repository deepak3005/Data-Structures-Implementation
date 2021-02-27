import java.util.*;

class FindingLeastValueInArray
{
    void findMinValue(int[] b)
    {
        int min = b[0];
        for(int j=0;j<b.length;j++)
        {
            if(b[j]<min)
            {
                min = b[j];
            }
        }
        System.out.println("Minimum value in array is : "+min);
    }
    
    public static void main(String args[])
    {
        FindingLeastValueInArray x = new FindingLeastValueInArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers to store in array : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        x.findMinValue(a);
    }
}
