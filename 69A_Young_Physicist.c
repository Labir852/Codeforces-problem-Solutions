#include <stdio.h>

int main()
{
    int i,x,y,z,n,sum,X=0,Y=0,Z=0;

    scanf("%d",&n);
    int final_sum[n];
    for (i=0;i<n;i++)
    {
        scanf("%d",&x);
        scanf("%d",&y);
        scanf("%d",&z);
        X += x;
        Y += y;
        Z += z;

    }

    if(X==0 && Y==0 && Z==0)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }

    return 0;
}
