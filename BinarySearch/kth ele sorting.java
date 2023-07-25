import java.util.Scanner;
import java.util.Arrays;
class Main
{
    static int kth(int n1,int n2,int arr1[],int arr2[],int k)
    {
        int pos=0;
        int len=n1+n2;
        int res[]=new int[len];
        for(int ele:arr1)
        {
            res[pos]=ele;
            pos++;
        }
        for(int ele:arr2)
        {
            res[pos]=ele;
            pos++;5
        }
        Arrays.sort(res);
        System.out.println("The kth elements is:\n"+res[k-1]);
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n1,n2,k;
        System.out.println("Enter arr1 size: ");
        n1=s.nextInt();
        System.out.println("Enter arr2 size: ");
        n2=s.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter arr1 elements: ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=s.nextInt();
        }
        int arr2[]=new int[n2];
        System.out.println("Enter arr2 elements: ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=s.nextInt();
        }
        System.out.println("enter k: ");
        k=s.nextInt();
        kth(n1,n2,arr1,arr2,k);
        //System.out.println(rres);
    