import java.util.Scanner;
class Main
{
    static int kadane(int n,int[] arr)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
          sum=sum+arr[i];
                if(max<sum)
            {
                max=sum;
            }
        
        if(sum<0) 
        {
            sum=0;
        }
        }
        
        return max;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the size: ");
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        long res=kadane(n,arr);
        System.out.println("The maximum subarray sum is "+res);
    }
    
}