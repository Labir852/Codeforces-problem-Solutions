#include<stdio.h>
int main()
{
    int n,i,p = 0,k,q;
    scanf("%d",&n);
    int a[n],b[n],cp[n];
    for(i=0;i<n;i++)
    {
        scanf("%d %d",&a[i],&b[i]);
    }

    for(i=0;i<n;i++)
    {
        cp[i]  = b[i];

        if(i>=1)
        {
            cp[i] = cp[i-1] - a [i]+b[i];
        }

    }



    for(i=0;i<n;i++)
    {

        if(cp[i]>p)
        {
            p = cp[i];;
        }
    }
    printf("%d",p);
    return 0;
}
