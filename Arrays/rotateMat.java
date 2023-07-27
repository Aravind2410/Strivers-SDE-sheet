import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r,c;
        System.out.println("enter rows: ");
        r=s.nextInt();
        System.out.println("enter cols: ");
        c=s.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        rotate(arr);
    }
    static void rotate(int arr[][])
    {
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][r-j-1];
                arr[i][r-j-1]=temp;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    
    
    
}
