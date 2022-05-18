import java.util.*;
class a5squarepattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int length=n*2-1;
        int first=0;
        int last=length-1;
        int[][] a=new int[last][last];
        while(n!=0)
        {
            for(int i=first;i<=last;i++)
            {
                for(int j=first;i<=last;j++)
                {
                    if(i==first || i==last || j==first || j==last)
                        a[i][j]=n;
                }
            }
            ++first;
            --last;
            --n;
        }
        for(int i=0;i<=last;i++)
        {
            for(int j=0;j<=last;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}