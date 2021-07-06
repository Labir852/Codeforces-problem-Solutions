#include<stdio.h>
int main()
{
    int a,b,i=0;
    scanf("%d %d",&a,&b);
    while(a<=b)
    {
        ++i;
        a *= 3;
        b *= 2;
    }
    printf("%d",i);

    return 0;
}
