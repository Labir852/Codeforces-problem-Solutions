#include<stdio.h>
int main()
{
    int i,n,w,k,output,total=0;

    scanf("%d %d %d",&k,&n,&w);
    for(i=1;i<=w;i++)
    {
        total += (i*k);
    }
    if(total>n)
    {
        output = total-n;
        printf("%d",output);
    }
    else
    {
        printf("0");
    }
    return 0;
}
