#include<stdio.h>
#include<math.h>
int main()
{
    int n,i,sum=0,s=0,j,temp;
    scanf("%d", &n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &a[i]);
        sum += a[i];
    }
    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            if(a[j]>a[i])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    int count=0,rest;
    for (i=0;i<n;i++)
    {
        s+=a[i];
        rest = sum-s;
        if(s>rest)
        {
            printf("%d",i+1);
            break;
        }
    }

    return 0;
}
