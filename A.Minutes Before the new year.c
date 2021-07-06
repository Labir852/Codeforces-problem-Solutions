#include<stdio.h>
int main()
{
    int n,h,m,t,i;
    scanf("\n%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("\n%d %d",&h,&m);
        if(h>=0 && h<24 && m>=0 && m<60)
        t=1440-((h*60)+m);
        printf("%d\n",t);
    }
    return 0;
}
