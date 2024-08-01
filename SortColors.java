import java.util.*;
class Solution {
    private static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void sortColors(int[] a) {
        int l=0;
        int m=0;
        int h=a.length-1;
        while(m<=h)
        {
            if(a[m]==0)
            {
                swap(a,l,m);
                m++;
                l++;
            
            }
            else if(a[m]==1)
            {
                m++;
            }
            else
            {
                swap(a,m,h);
                h--;
            }
        }
       
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number of elements");
        // n=sc.nextInt();
        // int a[]=new int[n];
        // System.out.println("Enter the array elemets");
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=sc.nextInt();
            
        // }
        int a[]={0,1,2,0,1,2};
        sortColors(a);
        for(int num:a)
        System.out.print(num+" ");
    }
}
