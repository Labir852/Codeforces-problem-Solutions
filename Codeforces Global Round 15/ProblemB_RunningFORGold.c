#include<stdio.h>
int main()
{
    int i,j,p,t,n,row=5;
    
    scanf("%d",&t);
    for(i=0;i<t;i++)
    {
        scanf("%d",&n);
        int a[n][row],flag[n],min;
        for ( j = 0; j < n; j++)
        {
            for ( p = 0; p < row; i++)
            {
                scanf("%d",&a[j][p]);
            }
            
        }
        for ( j = 0; j < n; j++)
        {
            for ( p = 0; p < row; i++)
            {
                min = a[p][j];
                if(a[p+1][j]<min)
                    min = a[p+1][j];
            }
            flag[j]=min;
            printf("\nflag = %d\n",min);
        }
        
        
    }
    return 0;
}