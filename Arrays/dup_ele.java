import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter size: ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int res=dup_ele(arr,n);
        System.out.println("The duplicate element is "+res);
    }
    static int dup_ele(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }
}