 Class Main
 {
public Static void main(String[] a)
{
 int[][] a={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[2-j][i];
                a[2-j][i]=a[2-i][2-j];
                a[2-i][2-j]=a[j][2-i];
                a[j][2-i]=temp;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<=2;j++)
            {
               System.out.print(a[i][j]);
            }
            System.out.println();
        }
        }
        }
